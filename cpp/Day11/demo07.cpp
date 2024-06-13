#include <iostream>
using namespace std;
// int num1 = 10;

void myfun()
{
    // int num1 = 10;
    static int num1 = 10;

    class Complex
    {
    private:
        int real;
        int imag;

    public:
        void accept()
        {
            cout << "accept" << endl;
            cout << num1 << endl;
        }
        void print()
        {
            cout << "print" << endl;
        }
    };
    Complex c1;
    c1.accept();
    c1.print();
}

int main()
{
    myfun();
    return 0;
}