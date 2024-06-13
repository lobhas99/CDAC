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

    // Inspectors
    int getReal()
    {
        return this->real;
    }

    int getImag()
    {
        return this->imag;
    }

    void setImag(int imag)
    {
        this->imag = imag;
    }
};

int main()
{

    Complex c1;
    // cout << "Value of c1.real = " << c1.real << endl;
    cout << "Value of c1.real = " << c1.getReal() << endl;
    // cout << "Value of c1.imag = " << c1.imag << endl;
    cout << "Value of c1.imag = " << c1.getImag() << endl;
    return 0;
}