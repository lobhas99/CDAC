#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    // void init()
    // {
    //     this->real = 10;
    //     this->imag = 20;
    // }

    // Parameterless Constructor
    Complex()
    {
        cout << "Inside Ctor" << endl;
        this->real = 10;
        this->imag = 20;
    }

    void printComplex()
    {
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    // Complex c1;
    // c1.init();
    // Complex c2;
    // c2.init();
    // Complex c3;
    // c3.init();

    // c1.printComplex();
    // c2.printComplex();
    // c3.printComplex();

    Complex c1;
    Complex c2;

    c1.printComplex();
    c2.printComplex();

    return 0;
}