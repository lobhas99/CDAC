#include <iostream>
using namespace std;
class Employee
{
private:
    int empid;
    string name;
    double salary;

public:
};
int main()
{
    // Employee earr[5];
    // Employee *earr[5];
    // Employee *earr = new Employee[5];
    Employee **earr = new Employee *[5];

    return 0;
}