#include <iostream>
using namespace std;
class Person
{
private:
    string name;

public:
    void acceptPerson()
    {
        cout << "Enter Name = ";
        cin >> this->name;
    }
    void displayPerson()
    {
        cout << "Name = " << this->name << endl;
    }
};

class Employee : public Person
{
private:
    int id;
    double salary;

public:
    void acceptEmployee()
    {
        cout << "Enter id and salary = ";
        cin >> this->id >> this->salary;
    }

    void displayEmployee()
    {
        cout << "Id = " << this->id << endl;
        cout << "salary = " << this->salary << endl;
    }
};

class Student : public Employee
{
};

int main()
{
    Person *person = new Student(); // upcasting
    person->acceptPerson();
    Employee *employee = static_cast<Employee *>(person); // downcasting
    employee->acceptEmployee();
    person->displayPerson();
    return 0;
}