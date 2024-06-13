#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    // parameterized Ctor
    Complex(int real, int imag)
    {
        cout << "Inside Parameterized Ctor" << endl;

        this->real = real;
        this->imag = imag;
    }

    Complex()
    {
        cout << "Inside Parameterless Ctor" << endl;
        this->real = 10;
        this->imag = 20;
    }

    void printComplex()
    {
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }

    // destructor
    ~Complex()
    {
        cout << "Inside Destructor" << endl;
        this->printComplex();
    }
};

int main()
{

    Complex c1;
    Complex c2(30, 40);

    return 0;
}