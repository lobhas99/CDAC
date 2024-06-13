#include <iostream>
using namespace std;

class Employee
{
private:
    int empid;

public:
    Employee()
    {
        this->empid = 0;
        cout << "Inside Employee::ctor" << endl;
    }
    virtual void accept()
    {
        cout << "enter empid = ";
        cin >> this->empid;
    }
    virtual void display()
    {
        cout << "empid = " << this->empid << endl;
    }
    virtual ~Employee()
    {
        cout << "Employee::Dtor" << endl;
    }
};

class Manager : virtual public Employee
{
private:
    int bonus;

protected:
    void accept_manager()
    {
        cout << "Enter bonus = ";
        cin >> this->bonus;
    }

    void display_manager()
    {
        cout << "bonus = " << this->bonus << endl;
    }

public:
    Manager()
    {
        this->bonus = 0;
        cout << "Inside Manager::ctor" << endl;
    }

    void accept()
    {
        Employee::accept();
        this->accept_manager();
    }
    void display()
    {
        Employee::display();
        this->display_manager();
    }
    ~Manager()
    {
        cout << "Manager::Dtor" << endl;
    }
};

class Salesman : virtual public Employee
{
private:
    int comm;

protected:
    void accept_Salesman()
    {
        cout << "Enter comm = ";
        cin >> this->comm;
    }
    void display_Salesman()
    {
        cout << "comm = " << this->comm << endl;
    }

public:
    Salesman()
    {
        this->comm = 0;
        cout << "Inside Salesman::ctor" << endl;
    }

    void accept()
    {
        Employee::accept();
        this->accept_Salesman();
    }

    void display()
    {
        Employee::display();
        this->display_Salesman();
    }
    ~Salesman()
    {
        cout << "Salesman::Dtor" << endl;
    }
};

class SalesManager : public Manager, public Salesman
{
public:
    SalesManager()
    {
        cout << "Inside SalesManager::ctor" << endl;
    }
    void accept()
    {
        Employee::accept();
        this->accept_manager();
        this->accept_Salesman();
    }
    void display()
    {
        Employee::display();
        this->display_manager();
        this->display_Salesman();
    }

    ~SalesManager()
    {
        cout << "SalesManager::Dtor" << endl;
    }
};

int main()
{

    Employee *eptr = new Manager;
    // Employee *eptr = new Salesman;
    // Employee *eptr = new SalesManager;
    eptr->accept();
    eptr->display();
    delete eptr;

    // Manager m;
    // m.accept();
    // m.display();

    // Salesman salesman;
    // salesman.accept();
    // salesman.display();

    // SalesManager salesManager;
    // salesManager.accept();
    // salesManager.display();

    return 0;
}
