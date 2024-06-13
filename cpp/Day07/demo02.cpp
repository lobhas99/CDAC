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

    void displayComplex()
    {
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }

    void setReal(int real)
    {
        this->real = real;
    }
};

int main()
{
    Complex c1(10, 20); // parameterized ctor
    c1.displayComplex();

    Complex c3 = c1; // Default Copy ctor
    c3.displayComplex();

    c3.setReal(100);
    cout << "After change in c3.real = " << endl;

    c1.displayComplex();
    c3.displayComplex();
    return 0;
}