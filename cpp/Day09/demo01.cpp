#include <iostream>
using namespace std;
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
    void printDate()
    {
        cout << this->day << "/" << this->month << "/" << this->year << endl;
    }
};

class Vehicle
{
private:
    string veh_name;
    string veh_number;

public:
    Vehicle()
    {
        this->veh_name = "";
        this->veh_number = "";
    }
    Vehicle(string veh_name, string veh_number)
    {
        this->veh_name = veh_name;
        this->veh_number = veh_number;
    }
    void acceptVehicle()
    {
        cout << "Enter veh_name = ";
        cin >> this->veh_name;
        cout << "Enter veh_number = ";
        cin >> this->veh_number;
    }
    void printVehicle()
    {
        cout << "veh_name = " << this->veh_name << endl;
        cout << "veh_number = " << this->veh_number << endl;
    }
};

class Employee
{
private:
    int empid;
    string name;
    double salary;
    Date doj;
    Vehicle *vehPtr;

public:
    Employee()
    {
        this->empid = 0;
        this->name = "";
        this->salary = 0;
        this->vehPtr = NULL;
    }

    Employee(int empid, string name, int salary, int day, int month, int year) : doj(day, month, year)
    {
        this->empid = empid;
        this->name = name;
        this->salary = salary;
        this->vehPtr = NULL;
    }

    void addVehicle()
    {
        int choice;
        cout << "Do you own a vehicle .. ?" << endl;
        cout << "1. Yes" << endl;
        cout << "2. No" << endl;
        cin >> choice;
        if (choice == 1)
        {
            this->vehPtr = new Vehicle();
            cout << "Enter the vehicle details = " << endl;
            this->vehPtr->acceptVehicle();
        }
    }

    void acceptEmployee()
    {
        cout << "Enter empid = ";
        cin >> this->empid;
        cout << "Enter name = ";
        cin >> this->name;
        cout << "Enter salary = ";
        cin >> this->salary;
        cout << "Enter DateofJoining = ";
        this->doj.acceptDate();
        this->addVehicle();
    }
    void printEmployee()
    {
        cout << "Empid = " << this->empid << endl;
        cout << "Name = " << this->name << endl;
        cout << "Salary = " << this->salary << endl;
        cout << "DateOfJoining = ";
        this->doj.printDate();
        if (this->vehPtr != NULL)
            this->vehPtr->printVehicle();
    }
    ~Employee()
    {
        if (this->vehPtr != NULL)
            delete this->vehPtr;
    }
};
int main()
{
    Employee e;
    // Employee e(1, "rohan", 1000, 1, 1, 2023);
    e.acceptEmployee();
    e.printEmployee();
    return 0;
}