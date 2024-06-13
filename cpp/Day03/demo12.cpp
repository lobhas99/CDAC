#include <iostream>
using namespace std;

// inline int size()
// {
//     return 5;
// }

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
void displayComplex(Complex *ptr)
{
    for (int i = 0; i < 5; i++)
        ptr[i].printComplex();
}

int main()
{
    Complex arr[5];

    // taking input for all complex objects
    for (int i = 0; i < 5; i++)
        arr[i].acceptComplex();

    displayComplex(arr);

    return 0;
}