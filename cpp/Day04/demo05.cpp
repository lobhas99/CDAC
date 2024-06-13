#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    void setReal(int real)
    {
        this->real = real;
    }
    void setImag(int imag)
    {
        this->imag = imag;
    }

    int getReal()
    {
        return this->real;
    }
    int getImag()
    {
        return this->imag;
    }
};

void acceptComplex(Complex &ref)
{
    int real, imag;
    cout << "Enter real and imag values = ";
    cin >> real >> imag;
    ref.setReal(real);
    ref.setImag(imag);
}

void printComplex(Complex *other)
{
    cout << "Real =  " << other->getReal() << endl;
    cout << "Imag =  " << other->getImag() << endl;
}

int main()
{
    Complex c;
    acceptComplex(c);
    printComplex(&c);
    return 0;
}