#include <iostream>
using namespace std;

class Complex
{
private:
    const int real;
    // mutable int imag;
    int imag;
    int num;

public:
    Complex(int real, int imag) : real(real), imag(imag)
    {
        this->num = 30;
    }

    void f2() const
    {
        // this->real = 50; // NOT OK
        // this->imag = 60; // NOT OK
        cout << "Inside :: f2() " << endl;
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }

    void f3() const // (const Complex *const this)
    {
        // this->real = 70; // NOT OK
        const_cast<Complex *const>(this)->imag = 80;
        // this->num = 50; NOT OK
        cout << "Inside :: f3() " << endl;
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    // int num1 = 10;
    // const int *const ptr = &num1;
    // *ptr = 20; // NOT OK
    Complex c1(10, 20);
    c1.f2();
    c1.f3();
    return 0;
}