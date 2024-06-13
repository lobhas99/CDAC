#include <iostream>
using namespace std;
// function overloading

void add(int num1, int num2) // add_i_i
{
    cout << "Addtion of 2 int numbers = " << num1 + num2 << endl;
}

void add(double num1, double num2) // add_d_d
{
    cout << "Addtion of 2 double numbers = " << num1 + num2 << endl;
}

void add(int num1, double num2) // add_i_d
{
    cout << "Addtion of 1 int and 1 double numbers = " << num1 + num2 << endl;
}
void add(double num1, int num2) // add_d_i
{
    cout << "Addtion of 1 double and 1 int numbers = " << num1 + num2 << endl;
}

void add(int num1, int num2, int num3) // add_i_i_i
{
    cout << "Addtion of 3 int numbers = " << num1 + num2 + num3 << endl;
}
int main()
{
    add(10, 20);
    add(10.20, 20.23);
    add(10, 20.23);
    add(10.12, 20);
    add(10, 20, 30);
    return 0;
}