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

    // Mutators
    void setReal(int real)
    {
        this->real = real;
    }

    void setImag(int imag)
    {
        this->imag = imag;
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
    // c1.real = 40;
    c1.setReal(40);

    // c1.imag = 50;
    c1.setImag(50);
    cout << "After change in real & imag - " << endl;
    c1.printComplex();
    return 0;
}