#include <iostream>
using namespace std;

template <typename T>
void add(T num1, T num2)
{
    cout << "Addition = " << num1 + num2 << endl;
}

int main()
{
    add(10, 20);
    add(10.20, 20.12);

    return 0;
}