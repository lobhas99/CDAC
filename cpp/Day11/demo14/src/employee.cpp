#include "../include/employee.h"
#include "../include/invalid_data_exception.h"
Employee::Employee()
{
    this->empid = 0;
    this->salary = 0;
}
Employee::Employee(int empid, string name, double salary) : Person(name)
{
    this->empid = empid;
    this->salary = salary;
}
void Employee::acceptData()
{
    cout << "Enter empid = ";
    cin >> this->empid;
    Person::acceptData();
    cout << "Enter salary = ";
    cin >> this->salary;
}
void Employee::printData()
{
    cout << "Empid = " << this->empid << endl;
    cout << "Name = " << this->getName() << endl;
    cout << "Salary = " << this->salary << endl;
}
void Employee::setEmpid(int empid)
{
    this->empid = empid;
}
void Employee::setSalary(double salary)
{
    this->salary = salary;
}
int Employee::getEmpid()
{
    return this->empid;
}
double Employee::getSalary()
{
    return this->salary;
}