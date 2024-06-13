#include <iostream>
using namespace std;

inline int add(int num1, int num2)
{
    // cout << "Addition  = " << num1 + num2 << endl;
    return (num1 + num2);
}

int main()
{
    // add(10, 20);
    cout << "Addition  = " << add(10, 20) << endl;

    return 0;
}