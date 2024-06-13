#include <iostream>
using namespace std;

constexpr int product(int num1, int num2)
{
    return num1 * num2;
}

int main()
{
    constexpr int result = product(5, 6);
    cout << "Product = " << result << endl;
}