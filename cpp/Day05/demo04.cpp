#include <iostream>
using namespace std;
// Employee has-a Vehicle

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
    Vehicle *vehPtr; // Association - Aggegration

public:
    Employee()
    {
        this->empid = 0;
        this->name = "";
        this->salary = 0;
        this->vehPtr = NULL;
    }

    Employee(int empid, string name, double salary)
    {
        this->empid = empid;
        this->name = name;
        this->salary = salary;
        this->vehPtr = NULL;
    }

    Employee(int empid, string name, double salary, string veh_name, string veh_number)
    {
        this->empid = empid;
        this->name = name;
        this->salary = salary;
        this->vehPtr = new Vehicle(veh_name, veh_number);
    }

    void addVehicle()
    {
        bool choice;
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
        this->addVehicle();
    }

    void printEmployee()
    {
        cout << "Empid = " << this->empid << endl;
        cout << "Name = " << this->name << endl;
        cout << "Salary = " << this->salary << endl;
        if (this->vehPtr != NULL)
            this->vehPtr->displayVehicle();
    }

    ~Employee()
    {
        if (this->vehPtr != NULL)
            delete this->vehPtr;
    }
};

int main()
{
    // Employee e1;
    // e1.printEmployee();

    // Employee e2;
    // e2.acceptEmployee();
    // e2.printEmployee();

    Employee e3(1, "rohan", 1000);
    e3.printEmployee();

    Employee e4(2, "rajiv", 2000, "abc", "mh121234");
    e4.printEmployee();
    return 0;
}