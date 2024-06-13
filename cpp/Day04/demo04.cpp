#include <iostream>
using namespace std;

void callByValue(int n)
{
    n = 20;
    cout << "Address of n = " << &n << endl;
    cout << "Value of n = " << n << endl;
}

void callByAddress(int *ptr)
{
    *ptr = 20;
    cout << "Address of ptr = " << &ptr << endl;
    cout << "Address of num1 in fun = " << ptr << endl;
    cout << "Value of num1 in fun = " << *ptr << endl;
}

void callByReference(int &ref)
{
    cout << "Address of ref = " << &ref << endl;
    cout << "Address of num1 in fun = " << &ref << endl;
    cout << "Value of num1 in fun = " << ref << endl;
}
int main()
{
    int num1 = 10;
    cout << "Address of num1 in main = " << &num1 << endl;
    cout << "Before change in num1= " << num1 << endl;
    // callByValue(num1);
    // callByAddress(&num1);
    callByReference(num1);

    cout << "After change in num1 = " << num1 << endl;

    return 0;
}