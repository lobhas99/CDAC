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

    void displayDate()
    {
        cout << this->day << "/" << this->month << "/" << this->year << endl;
    }
};

class Person
{
private:
    string name;
    Date date;

public:
    Person()
    {
        this->name = "";
    }
    Person(string name)
    {
        this->name = name;
    }
    virtual void acceptData()
    {
        cout << "Enter the name = ";
        cin >> this->name;
        this->date.acceptDate();
    }
    virtual void displayData()
    {
        cout << "Name = " << this->name << endl;
    }

    Date getDate()
    {
        return this->date;
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
        this->empid = 0;
        this->salary = 0;
    }
    Employee(int empid, string name, double salary) : Person(name)
    {
        this->empid = empid;
        this->salary = salary;
    }
    void acceptData()
    {
        cout << "Enter the empid = ";
        cin >> this->empid;

        Person::acceptData();

        cout << "Enter the salary = ";
        cin >> this->salary;
    }

    void displayData()
    {
        cout << "Empid = " << this->empid << endl;
        Person::displayData();
        cout << "Salary = " << this->salary << endl;
        cout << "Date of joining = ";
        this->getDate().displayDate();
    }
};

class Student : public Person
{
private:
    int rollno;
    double marks;

public:
    Student()
    {
        this->rollno = 0;
        this->marks = 0;
    }
    Student(int rollno, string name, double marks) : Person(name)
    {
        this->rollno = rollno;
        this->marks = marks;
    }

    void acceptData()
    {
        cout << "Enter the rollno = ";
        cin >> this->rollno;

        Person::acceptData();

        cout << "Enter the marks = ";
        cin >> this->marks;
    }

    void displayData()
    {
        cout << "Roll no = " << this->rollno << endl;
        Person::displayData();
        cout << "Marks = " << this->marks << endl;
        cout << "Birthdate = ";
        this->getDate().displayDate();
    }
};

enum EMainMenu
{
    EXIT,
    EMPLOYEE,
    STUDENT
};

EMainMenu menu()
{
    int choice;
    cout << "0. EXIT" << endl;
    cout << "1. Employee Data" << endl;
    cout << "2. Student Data" << endl;
    cout << "Enter your choice = ";
    cin >> choice;
    return EMainMenu(choice);
}

int main()
{
    EMainMenu choice;
    Person *person = NULL;
    while ((choice = menu()) != EXIT)
    {
        switch (choice)
        {
        case EMPLOYEE:
            person = new Employee();
            break;
        case STUDENT:
            person = new Student();
            break;
        default:
            cout << "Wrong choice.." << endl;
            break;
        }
        if (person != NULL)
        {
            person->acceptData();
            person->displayData();
            delete person;
            person = NULL;
        }
    }

    return 0;
}