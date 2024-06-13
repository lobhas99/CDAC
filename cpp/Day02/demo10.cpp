#include <iostream>
using namespace std;
class Complex
{
private:
    int real;
    int imag;

public:
    void accept()
    {
        cout << "Enter the real and imag values = ";
        cin >> real >> imag;
    }
    void print()
    {
        cout << "Real and imag = " << real << "," << imag << endl;
    }
};

int main()
{
    Complex c;
    c.accept();
    c.print();
    return 0;
}