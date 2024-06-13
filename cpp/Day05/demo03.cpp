#include <iostream>
using namespace std;
// Employee has-a DateOfJoining

class Date
{
private:
    int day;
    int month;
    int year;

public:
    Date()
    {
        this->day = 0;
        this->month = 0;
        this->year = 0;
    }

    Date(int day, int month, int year)
    {
        this->day = day;
        this->month = month;
        this->year = year;
    }

    void acceptDate()
    {
        cout << "Enter day = ";
        cin >> this->day;
        cout << "Enter month = ";
        cin >> this->month;
        cout << "Enter year = ";
        cin >> this->year;
    }

    void setDay(int day)
    {
        this->day = day;
    }
    void setMonth(int month)
    {
        this->month = month;
    }
    void setYear(int year)
    {
        this->year = year;
    }

    void displayDate()
    {
        cout << this->day << "/" << this->month << "/" << this->year << endl;
    }
};

class Employee
{
private:
    int empid;
    string name; // compostion or aggegration
    double salary;
    Date doj; // Association - Composition
public:
    Employee()
    {
        this->empid = 0;
        this->name = "";
        this->salary = 0;
    }

    Employee(int empid, string name, double salary, int day, int month, int year) : doj(day, month, year) // way1
    {
        this->empid = empid;
        this->name = name;
        this->salary = salary;

        // way2
        //  this->doj.setDay(day);
        //  this->doj.setMonth(month);
        //  this->doj.setYear(year);
    }

    void acceptEmployee()
    {
        cout << "Enter the empid = ";
        cin >> this->empid;
        cout << "Enter the name = ";
        cin >> this->name;
        cout << "Enter the salary = ";
        cin >> this->salary;
        cout << "Enter the joining date below : " << endl;
        this->doj.acceptDate();
    }

    void printEmployee()
    {
        cout << "Empid = " << this->empid << endl;
        cout << "Name = " << this->name << endl;
        cout << "Salary = " << this->salary << endl;
        cout << "Date of Joining = ";
        this->doj.displayDate();
    }
};

int main()
{
    // Employee e1;
    // e1.acceptEmployee();
    // e1.printEmployee();

    Employee e2(1, "rohan", 1000, 1, 1, 2023);
    e2.printEmployee();
    return 0;
}