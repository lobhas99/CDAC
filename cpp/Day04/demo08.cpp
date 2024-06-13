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
        this->real = 10;
        this->imag = 20;
    }

    Complex(int real, int imag)
    {
        this->real = real;
        this->imag = imag;
    }

    void printComplex()
    {
        cout << "real = " << this->real << endl;
        cout << "imag = " << this->imag << endl;
    }
};

int main()
{
    Complex *cptr = new Complex;
    cptr->printComplex();

    Complex *cptr2 = new Complex(30, 40);
    cptr2->printComplex();

    delete cptr;

    delete cptr2;
    return 0;
}