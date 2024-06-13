#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    void acceptComplex()
    {
        cout << "Enter real = ";
        cin >> this->real;
        cout << "Enter imag = ";
        cin >> imag;
    }

    void printComplex()
    {
        cout << "Real = " << this->real << endl;
        cout << "Imag = " << this->imag << endl;
    }
};

int main()
{
    Complex arr[5];
    // arr[0].acceptComplex();
    // arr[1].acceptComplex();

    // arr[0].printComplex();
    // arr[1].printComplex();

    // taking input for all complex objects
    for (int i = 0; i < 5; i++)
        arr[i].acceptComplex();

    // displaying all complex objects
    for (int i = 0; i < 5; i++)
        arr[i].printComplex();

    return 0;
}