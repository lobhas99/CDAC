#include <iostream>
using namespace std;

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
            throw 2;

        cout << "Age = ";
        cin >> age;
        if (age < 18)
            throw 1.3;

        cout << "Salary = ";
        cin >> salary;
        if (salary < 500)
            throw "Salary is very less..:(";
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
    try
    {
        Employee *eptr = Employee::acceptEmployee();
        eptr->displayEmployee();
        delete eptr;
    }
    catch (int error)
    {
        cout << "Empid is incorrect.. cannot create the object" << endl;
    }
    catch (double error)
    {
        cout << "Age is incorrect.. cannot create the object" << endl;
    }
    catch (char const *error)
    {
        cout << "Salary is incorrect..cannot create the object" << endl;
        cout << error << endl;
    }

    cout << "Successful execution" << endl;
    return 0;
}