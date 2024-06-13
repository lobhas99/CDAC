#include <iostream>
using namespace std;
// Employee has-a DateOfJoining
// Employee has-a Vehicle
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
        cout << "Enter vehicle name = ";
        cin >> this->veh_name;
        cout << "Enter vehicle Number = ";
        cin >> this->veh_number;
    }

    void displayVehicle()
    {
        cout << "Vehicle name = " << this->veh_name << endl;
        cout << "Vehicle number = " << this->veh_number << endl;
    }
};

class Employee
{
private:
    int empid;
    string name;
    double salary;
    Date *dPtr;      // Composition
    Vehicle *vehPtr; // Aggegration

public:
    Employee()
    {
        this->empid = 0;
        this->name = "";
        this->salary = 0;
        this->vehPtr = NULL;
        this->dPtr = new Date();
    }

    Employee(int empid, string name, double salary, int day, int month, int year)
    {
        this->empid = empid;
        this->name = name;
        this->salary = salary;
        this->vehPtr = NULL;
        this->dPtr = new Date(day, month, year);
    }

    Employee(int empid, string name, double salary, int day, int month, int year, string veh_name, string veh_number)
    {
        this->empid = empid;
        this->name = name;
        this->salary = salary;
        this->vehPtr = new Vehicle(veh_name, veh_number);
        this->dPtr = new Date(day, month, year);
    }

    void addVehicle()
    {
        int choice;
        cout << "Do you have a vehicle ?" << endl;
        cout << "1. Yes" << endl;
        cout << "2. N0" << endl;
        cout << "Enter your option - ";
        cin >> choice;
        if (choice == 1)
        {
            this->vehPtr = new Vehicle();
            this->vehPtr->acceptVehicle();
        }
        else
            cout << "Hope you get your own vehicle soon..." << endl;
    }

    void acceptEmployee()
    {
        cout << "Enter the empid = ";
        cin >> this->empid;
        cout << "Enter the name = ";
        cin >> this->name;
        cout << "Enter the salary = ";
        cin >> this->salary;
        cout << "Enter the joining date below - " << endl;
        this->dPtr->acceptDate();
        this->addVehicle();
    }

    void printEmployee()
    {
        cout << "Empid = " << this->empid << endl;
        cout << "Name = " << this->name << endl;
        cout << "Salary = " << this->salary << endl;
        cout << "Date of joining - ";
        this->dPtr->displayDate();
        if (this->vehPtr != NULL)
            this->vehPtr->displayVehicle();
    }

    ~Employee()
    {
        delete this->dPtr;
        if (this->vehPtr != NULL)
            delete this->vehPtr;
        this->dPtr = NULL;   // to avoid dangling pointer
        this->vehPtr = NULL; // to avoid dangling pointer
    }
};

int main()
{
    // Employee e1;
    // e1.printEmployee();

    Employee e2;
    e2.acceptEmployee();
    e2.printEmployee();

    Employee e3(1, "rohan", 1000, 1, 1, 2023);
    e3.printEmployee();

    Employee e4(2, "rajiv", 2000, 2, 2, 2022, "abc", "mh121234");
    e4.printEmployee();
    return 0;
}