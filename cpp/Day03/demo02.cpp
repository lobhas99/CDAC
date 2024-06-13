#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    void acceptComplex() // Complex * const this
    {
        cout << "Enter real = ";
        cin >> this->real;
        cout << "Enter imag = ";
        cin >> imag;
    }
    void printComplex() // Complex * const this
    {
        cout << "Real = " << real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    Complex c1;
    Complex c2;
    Complex c3;

    c3.acceptComplex(); // acceptComplex(&c3)
    c1.acceptComplex(); // acceptComplex(&c2)
    c2.acceptComplex(); // acceptComplex(&c2)

    c1.printComplex(); // printComplex(&c1)
    c2.printComplex(); // printComplex(&c2)
    c3.printComplex(); // printComplex(&c3)
}