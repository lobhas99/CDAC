#ifndef COMPLEX_H
#define COMPLEX_H
#include <iostream>
using namespace std;
class Complex
{
private:
    int real;
    int imag;

public:
    Complex();
    Complex(int real, int imag);
    void acceptComplex();
    void printComplex();
};

#endif