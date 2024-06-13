#include <iostream>
using namespace std;

class Employee
{

public:
    void acceptEmployee()
    {
        cout << "accept::Employee ";
    }

    void displayEmployee()
    {
        cout << "display::Employee" << endl;
    }
};

class Complex
{
public:
    void acceptComplex()
    {
        cout << "accept::Complex ";
    }

    void displayComplex()
    {
        cout << "display::Complex" << endl;
    }
};

int main()
{
    Employee *emp = new Employee;
    Complex *complex = reinterpret_cast<Complex *>(emp);
    complex->acceptComplex();
    complex->displayComplex();
    return 0;
}