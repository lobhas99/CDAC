#include <iostream>
using namespace std;
class Complex
{
private:
    const int real;
    int imag;

public:
    Complex(int real, int imag) : real(real), imag(imag)
    {
    }

    int getReal() const
    {
        return this->real;
    }
    void setImag(int imag)
    {
        this->imag = imag;
    }
    int getImag() const
    {
        return this->imag;
    }

    void printComplex() const
    {
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    const Complex c1(10, 20);
    c1.printComplex();
    // c1.setImag(30); // NOT OK

    Complex c2(30, 40);
    c2.setImag(50);
    c2.printComplex();
    return 0;
}