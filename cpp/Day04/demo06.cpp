#include <iostream>
using namespace std;

int main()
{
    int *ptr = (int *)malloc(sizeof(int) * 3);
    cout << "Address on heap = " << ptr << endl;
    cout << "Address of ptr = " << &ptr << endl;
    ptr[0] = 10;
    ptr[1] = 10;
    ptr[2] = 10;
    cout << "Value on heap = " << *ptr << endl;
    free(ptr);
    return 0;
}