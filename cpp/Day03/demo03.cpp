#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    // facilitators
    void acceptComplex()
    {
        cout << "Enter real = ";
        cin >> this->real;
        cout << "Enter imag = ";
        cin >> imag;
    }
    void printComplex()
    {
        cout << "Real = " << real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    Complex c1;
}