#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    double num1 = 123.456;
    cout << setprecision(2) << fixed << num1 << endl;

    string name = "Hello";
    string mobile = "9388";
    cout << setw(10) << name << endl;
    cout << setw(10) << setfill('X') << mobile << endl;
    return 0;
}