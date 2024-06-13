#include "complex.h"
int main()
{
    cout << "Multiple files demo" << endl;
    Complex c1;
    c1.acceptComplex();
    c1.printComplex();

    Complex c2(30, 40);
    c2.printComplex();

    Complex c3;
    c3.printComplex();
    return 0;
}