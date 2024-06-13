#include <iostream>
using namespace std;

int main()
{
    int *ptr = new int[3]; // Dynamic memory allocation
    cout << "Address on heap = " << ptr << endl;
    cout << "Address of ptr = " << &ptr << endl;
    ptr[0] = 10;
    ptr[1] = 20;
    ptr[2] = 30;
    cout << "Value on heap = " << *ptr << endl;
    delete ptr;
    return 0;
}

int main1()
{
    int *ptr = new int; // Dynamic memory allocation
    cout << "Address on heap = " << ptr << endl;
    cout << "Address of ptr = " << &ptr << endl;
    *ptr = 10;
    cout << "Value on heap = " << *ptr << endl;
    delete ptr;
    return 0;
}