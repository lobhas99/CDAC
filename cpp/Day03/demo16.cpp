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
        // this->imag = 50; // NOT OK
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    Complex c1(10, 20);
    c1.printComplex();
    return 0;
}