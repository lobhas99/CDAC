#include <iostream>
using namespace std;
class Complex
{
private:
    const int real;
    int imag;

public:
    // ctor members initializer list
    Complex() : real(10)
    {
        // this->real = 10; // Cannot initalize it inside Ctor body
        this->imag = 20;
    }
    // Complex(int real, int imag) : real(real)
    // {
    //     // this->real = real;// Cannot initalize it inside Ctor body
    //     this->imag = imag;
    // }

    Complex(int real, int imag) : real(real), imag(imag)
    {
    }

    void printComplex()
    {
        // this->real = 50; // NOT OK
        this->imag = 60;
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    Complex c1;
    c1.printComplex();

    Complex c2(30, 40);
    c2.printComplex();
    return 0;
}