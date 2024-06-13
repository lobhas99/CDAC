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

    int getReal()
    {
        return this->real;
    }
    int getImag()
    {
        return this->imag;
    }
    void setReal(int real)
    {
        this->real = real;
    }
    void setImag(int imag)
    {
        this->imag = imag;
    }
    friend void displayComplex(Complex &other);
    friend void acceptComplex(Complex &other);
    friend void addRealImag(Complex &other)
    {
        cout << "Addition = " << other.real + other.imag << endl;
    }
};

void displayComplex(Complex &other)
{
    // cout << "Real = " << other.getReal();
    // cout << "Imag = " << other.getImag();
    cout << "Real = " << other.real << endl;
    cout << "Imag = " << other.imag << endl;
}

void acceptComplex(Complex &other)
{
    // int real;
    // int imag;
    // cout << "Enter the real = ";
    //  cin >> real;
    //  other.setReal(real);
    // cout << "Enter the imag = ";
    //  cin >> imag;
    //  other.setImag(imag);

    cout << "Enter the real = ";
    cin >> other.real;
    cout << "Enter the imag = ";
    cin >> other.imag;
}

int main()
{
    Complex c1(10, 20);
    displayComplex(c1);

    Complex c2;
    acceptComplex(c2);
    displayComplex(c2);

    addRealImag(c2);

    return 0;
}