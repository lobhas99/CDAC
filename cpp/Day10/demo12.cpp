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
    Student()
    {
    }
    Student(int rollno, string name, double marks)
    {
        this->rollno = rollno;
        this->name = name;
        this->marks = marks;
    }
    int getRollno()
    {
        return this->rollno;
    }
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
    cout << "4. Add Student" << endl;
    cout << "5. Find Student" << endl;
    cout << "6. Display All Students" << endl;
    cout << "Enter choice = " << endl;
    cin >> choice;
    return choice;
}

void addDummyData(vector<Person *> &persons)
{
    persons.push_back(new Employee(1, "e1", 1000));
    persons.push_back(new Student(1, "s1", 50));

    persons.push_back(new Employee(3, "e3", 3000));
    persons.push_back(new Student(2, "s2", 60));

    persons.push_back(new Employee(2, "e2", 2000));
    persons.push_back(new Student(3, "s3", 70));
}

void findEmployee(vector<Person *> &persons)
{
    int id;
    cout << "Enter the id = ";
    cin >> id;
    Employee *eptr;
    for (int i = 0; i < persons.size(); i++)
    {
        if (typeid(*persons.at(i)) == typeid(Employee))
        {
            eptr = dynamic_cast<Employee *>(persons.at(i));
            if (id == eptr->getEmpid())
            {
                eptr->displayData();
                return;
            }
        }
    }
}

void findStudent(vector<Person *> &persons)
{
    int id;
    cout << "Enter the id = ";
    cin >> id;
    Student *sptr;
    for (int i = 0; i < persons.size(); i++)
    {
        if (typeid(*persons.at(i)) == typeid(Student))
        {
            sptr = dynamic_cast<Student *>(persons.at(i));
            if (id == sptr->getRollno())
            {
                sptr->displayData();
                return;
            }
        }
    }
}

int main()
{
    // creating a vector for employees.
    vector<Person *> persons;

    // function called to initialize the vector with few dummy data
    addDummyData(persons);

    Person *ptr = NULL;
    int choice;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            ptr = new Employee();
            ptr->acceptData();
            persons.push_back(ptr);
            break;
        case 2:
            findEmployee(persons);
            break;
        case 3:
            for (int i = 0; i < persons.size(); i++)
                if (typeid(*persons.at(i)) == typeid(Employee))
                    persons.at(i)->displayData();
            break;
        case 4:
            ptr = new Student();
            ptr->acceptData();
            persons.push_back(ptr);
            break;
        case 5:
            findStudent(persons);

            break;
        case 6:
            for (int i = 0; i < persons.size(); i++)
                if (typeid(*persons.at(i)) == typeid(Student))
                    persons.at(i)->displayData();
            break;

        default:
            cout << "Wrong choice ...:(" << endl;
            break;
        }
    }

    return 0;
}