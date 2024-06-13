#include "complex.h"

Complex::Complex()
{
    this->real = 10;
    this->imag = 20;
}

Complex::Complex(int real, int imag)
{
    this->real = real;
    this->imag = imag;
}

void Complex::acceptComplex()
{
    cout << "Enter real = ";
    cin >> this->real;
    cout << "Enter imag = ";
    cin >> this->imag;
}

void Complex::printComplex()
{
    cout << "real = " << this->real << endl;
    cout << "imag = " << this->imag << endl;
}