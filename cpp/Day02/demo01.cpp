#include <iostream>
class Complex
{
private:
    // data members
    int real;
    int imag;

public:
    // Member Functions
    void accept()
    {
        printf("Enter the real and imag vales = ");
        scanf("%d%d", &real, &imag);
    }
    void print()
    {
        int num1;
        printf("Real = %d\n", real);
        printf("Imag = %d\n", imag);
    }
};

int main()
{
    Complex c; // object
    c.accept();
    c.print();
    Complex c2; // object
    c2.accept();
    c2.print();
    Complex c3; // object
    c3.accept();
    c3.print();
}