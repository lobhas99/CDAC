#include <iostream>
using namespace std;

class Employee
{
private:
    int empid;
    string name;
    double salary;

public:
    friend void operator>>(istream &in, Employee &e);
};

void operator>>(istream &in, Employee &e)
{
    cout << "Enetr empid = ";
    in >> e.empid;
    cout << "Enter name = ";
    in >> e.name;
    cout << "Enter Salary = ";
    in >> e.salary;
}

int main()
{
    Employee e1;
    cout << "Enter employee data =  " << endl;
    cin >> e1; // operator>>(cin,e1);
    // e1>>cin // e1.operator>>(cin)

    return 0;
}