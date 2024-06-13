#include <iostream>
#include <fstream>
using namespace std;

class Employee
{
private:
    int empid;
    string name;
    double salary;

public:
    void writeintofile()
    {
        ofstream fout("./emp.txt", ios::app);
        fout << this->empid << "," << this->name << "," << this->salary << endl;
        fout.close();
    }
    void acceptEmployee()
    {
        cout << "Enter empid = ";
        cin >> this->empid;
        cout << "Enter name = ";
        cin >> this->name;
        cout << "Enter salary = ";
        cin >> this->salary;
        this->writeintofile();
    }
    void displayEmployee()
    {
        cout << "empid = " << this->empid << endl;
        cout << "Name = " << this->name << endl;
        cout << "Salary = " << this->salary << endl;
    }
    static void readEmpFile()
    {
        ifstream fin("./emp.txt");
        string line;
        while (getline(fin, line))
        {
            cout << line << endl;
        }

        fin.close();
    }
};

int main()
{
    // Employee e1;
    // e1.acceptEmployee();
    Employee::readEmpFile();
    return 0;
}