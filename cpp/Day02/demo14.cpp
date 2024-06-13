#include <iostream>
using namespace std;
// default argument Function
void add(int num1, int num2, int num3 = 0, int num4 = 0)
{
    cout << "Addtion  = " << num1 + num2 + num3 + num4 << endl;
}

int main()
{
    add(10, 20);
    add(10, 20, 30);
    add(10, 20, 30, 40);
    return 0;
}