#include <iostream>
using namespace std;

int main()
{
    const int num1 = 10;
    // num1 = 20; // NOT OK

    int num2 = 20;
    num2 = 30;

    int *ptr1 = &num2;
    *ptr1 = 40;

    int num3;
    ptr1 = &num3;

    // ptr1 = &num1; //NOT OK

    // const int *ptr2 = &num1;
    // OR
    int const *ptr2 = &num1;
    //*ptr2 = 20; // NOT OK

    ptr2 = &num2;
    //*ptr2 = 30; // NOT OK

    int *const ptr3 = &num2;
    *ptr3 = 30;
    // ptr3 = &num3; // NOT OK

    const int *const ptr4 = &num1;
    //*ptr4 = 20; // NOT OK
    // ptr4 = &num3; // NOT ok

    return 0;
}