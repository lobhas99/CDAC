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
    friend void operator<<(ostream &out, Employee &e1);
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

void operator<<(ostream &out, Employee &e1)
{
    out << "Empid = " << e1.empid << endl;
    out << "Name = " << e1.name << endl;
    out << "Salary = " << e1.salary << endl;
}

int main()
{
    Employee e1;
    cout << "Enter employee data =  " << endl;
    cin >> e1; // operator>>(cin,e1);

    cout << "Employee data =  " << endl;
    cout << e1; // operator<<(cout,e1);
    // e1<<cout; //e1.operator<<(cout);

    return 0;
}