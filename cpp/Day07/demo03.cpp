#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    Complex()
    {
        cout << "Inside Parameterless Ctor" << endl;
        this->real = 0;
        this->imag = 0;
    }
    Complex(int real, int imag)
    {
        cout << "Inside Parameterized Ctor" << endl;
        this->real = real;
        this->imag = imag;
    }

    Complex(Complex &other)
    {
        cout << "Inside copy Ctor" << endl;
        this->real = other.real;
        this->imag = other.imag;
    }

    void displayComplex()
    {
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    Complex c1(10, 20); // parameterized ctor
    c1.displayComplex();

    Complex c2 = c1; // Copy Ctor // c2.Complex(c1)
    c2.displayComplex();

    return 0;
}