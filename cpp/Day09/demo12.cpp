#include <iostream>
using namespace std;

class EmployeeException
{
private:
    string message;

public:
    EmployeeException()
    {
        this->message = "error in performing the operation";
    }
    EmployeeException(string message)
    {
        this->message = message;
    }
    void printErrorMessage()
    {
        cout << "msg - " << this->message << endl;
    }
};

class Employee
{
private:
    int empid;
    int age;
    double salary;

public:
    Employee(int empid, int age, double salary)
    {
        this->empid = empid;
        this->age = age;
        this->salary = salary;
    }
    static Employee *acceptEmployee()
    {
        int empid, age;
        double salary;
        cout << "Empid = ";
        cin >> empid;
        if (empid <= 0)
            throw new EmployeeException();

        cout << "Age = ";
        cin >> age;
        if (age < 18)
            throw new EmployeeException("Age is incorrect.. cannot create the object");

        cout << "Salary = ";
        cin >> salary;
        if (salary < 500)
            throw new EmployeeException("Salary is incorrect...");
        return new Employee(empid, age, salary);
    }

    void displayEmployee()
    {
        cout << "Empid = " << this->empid << endl;
        cout << "Age = " << this->age << endl;
        cout << "Salary = " << this->salary << endl;
    }
};

int main()
{
    Employee *eptr = NULL;
    try
    {
        eptr = Employee::acceptEmployee();
    }
    catch (EmployeeException *e)
    {
        e->printErrorMessage();
    }

    if (eptr != NULL)
    {
        eptr->displayEmployee();
        delete eptr;
        eptr = NULL;
    }
    cout << "Successful execution" << endl;
    return 0;
}