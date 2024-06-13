#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include "./person.h"
class Employee : public Person
{
private:
    int empid;
    double salary;

public:
    Employee();
    Employee(int empid, string name, double salary);
    void acceptData();
    void printData();
    void setEmpid(int empid);
    void setSalary(double salary);
    int getEmpid();
    double getSalary();
};

#endif