#include <iostream>
using namespace std;

class Employee
{
private:
    string name;
    int empid;
    double salary;

public:
    getempid();
    friend void search(Employee *e);
};
void search(Employee *e)
{
    if (e[0].empid == empid)
}

int main()
{
    Employee arr[5];
    search(arr);
    return 0;
}