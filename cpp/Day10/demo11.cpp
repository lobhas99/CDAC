#include <iostream>
#include <vector>
using namespace std;

class Person
{
protected:
    string name;

public:
    virtual void acceptData()
    {
        cout << "Enter name = ";
        cin >> this->name;
    }

    virtual void displayData()
    {
        cout << "Name = " << this->name << endl;
    }
};

class Employee : public Person
{
private:
    int empid;
    double salary;

public:
    Employee()
    {
    }
    Employee(int empid, string name, double salary)
    {
        this->empid = empid;
        this->name = name;
        this->salary = salary;
    }

    int getEmpid()
    {
        return this->empid;
    }

    void acceptData()
    {
        cout << "Enter empid = ";
        cin >> this->empid;
        Person::acceptData();
        cout << "Enter salary = ";
        cin >> this->salary;
    }
    void displayData()
    {
        Person::displayData();
        cout << "Empid = " << this->empid << endl;
        cout << "Salary = " << this->salary << endl;
    }
};

class Student : public Person
{
private:
    int rollno;
    double marks;

public:
    void acceptData()
    {
        cout << "Enter rollno = ";
        cin >> this->rollno;
        Person::acceptData();
        cout << "Enter marks = ";
        cin >> this->marks;
    }
    void displayData()
    {
        Person::displayData();
        cout << "Rollno = " << this->rollno << endl;
        cout << "Marks = " << this->marks << endl;
    }
};

int menu()
{
    int choice;
    cout << "0. EXIT" << endl;
    cout << "1. Add Employee" << endl;
    cout << "2. Find Employee" << endl;
    cout << "3. Display All Employees" << endl;
    cout << "Enter choice = " << endl;
    cin >> choice;
    return choice;
}

void addEmployees(vector<Employee *> &employees)
{
    employees.push_back(new Employee(1, "e1", 1000));
    employees.push_back(new Employee(2, "e2", 2000));
    employees.push_back(new Employee(3, "e3", 3000));
}

void findEmployee(vector<Employee *> &employees)
{
    int empid;
    cout << "Enter the empid = ";
    cin >> empid;
    for (int i = 0; i < employees.size(); i++)
        if (empid == employees.at(i)->getEmpid())
        {
            employees.at(i)->displayData();
            return;
        }
    cout << "Employee not Found..:(" << endl;
}

int main()
{
    // creating a vector for employees.
    vector<Employee *> employees;

    // function called to initialize the vector with few dummy employees
    addEmployees(employees);

    Employee *eptr = NULL;
    int choice;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            eptr = new Employee();
            eptr->acceptData();
            employees.push_back(eptr);
            break;
        case 2:
            findEmployee(employees);
            break;
        case 3:
            for (int i = 0; i < employees.size(); i++)
                employees.at(i)->displayData();
            break;

        default:
            cout << "Wrong choice ...:(" << endl;
            break;
        }
    }

    return 0;
}