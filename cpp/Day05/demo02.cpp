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

    void displayDate()
    {
        cout << this->day << "/" << this->month << "/" << this->year << endl;
    }
};

class Employee
{
private:
    int empid;
    string name;
    double salary;
    Date doj; // Association
public:
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
    Employee e;
    e.acceptEmployee();
    e.printEmployee();
    return 0;
}