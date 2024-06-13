#include <iostream>
using namespace std;

void changeNum1(int *ptr)
{
    cout << "Address of num1 using ptr= " << ptr << endl;
    cout << "Address of ptr= " << &ptr << endl;
    *ptr = 20;
}

int main()
{
    int num1 = 10;
    cout << "Address of num1 = " << &num1 << endl;
    cout << "Before change in num1 = " << num1 << endl;
    changeNum1(&num1);
    cout << "After change in num1 = " << num1 << endl;

    return 0;
}