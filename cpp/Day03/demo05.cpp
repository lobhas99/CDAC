#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    // Parameterless Constructor
    Complex()
    {
        cout << "Inside Parameterless Ctor" << endl;
        this->real = 10;
        this->imag = 20;
    }

    // parameterized Ctor
    Complex(int r, int i)
    {
        cout << "Inside Parameterized Ctor" << endl;
        this->real = r;
        this->imag = i;
    }

    Complex(int value)
    {
        cout << "Inside single Parameterized Ctor" << endl;
        this->real = value;
        this->imag = value;
    }

    void printComplex()
    {
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
    Complex c3(50);
    c3.printComplex();
    return 0;
}