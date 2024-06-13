#include "../include/employee.h"
#include "../include/student.h"
#include <vector>
#include <fstream>
#include <sstream>
enum EMainMenu
{
    EXIT,
    ADD_EMPLOYEE,
    ADD_STUDENT,
    DISPLAY_ALL_EMPLOYEES,
    DISPLAY_ALL_STUDENTS,
    FIND_EMPLOYEE,
    FIND_STUDENT
};

EMainMenu menu()
{
    int choice;
    cout << "************************" << endl;
    cout << "0. EXIT" << endl;
    cout << "1. Add Employee" << endl;
    cout << "2. Add Student" << endl;
    cout << "3. Display All Employees" << endl;
    cout << "4. Display All Students" << endl;
    cout << "5. Find Employee" << endl;
    cout << "6. Find Student" << endl;
    cout << "Enter Choice = ";
    cin >> choice;
    cout << "************************" << endl;

    return EMainMenu(choice);
}

void loadEmployeeData(vector<Employee *> &employee_list)
{
    ifstream fin("../data/Employee.txt");

    string line;
    while (getline(fin, line))
    {
        stringstream str(line);

        string token[3];
        for (int i = 0; i < 3; i++)
            getline(str, token[i], ',');

        employee_list.push_back(new Employee(stoi(token[0]), token[1], stod(token[2])));
    }
    fin.close();
    cout << "***********************" << endl;
    cout << "Employee Data Loaded..." << endl;
    cout << "***********************" << endl;
}

void loadStudentData(vector<Student *> &student_list)
{
    ifstream fin("../data/Students.txt");
    string line;
    while (getline(fin, line))
    {
        stringstream str(line);
        string rollno;
        string name;
        string marks;
        getline(str, rollno, ',');
        getline(str, name, ',');
        getline(str, marks, ',');

        Student *sptr = new Student(stoi(rollno), name, stod(marks));
        student_list.push_back(sptr);
    }

    fin.close();
    cout << "***********************" << endl;
    cout << "Student Data Loaded..." << endl;
    cout << "***********************" << endl;
}
void saveData(vector<Employee *> &employee_list, vector<Student *> &student_list)
{
    ofstream fout1("../data/Employee.txt");
    for (int i = 0; i < employee_list.size(); i++)
    {
        fout1 << employee_list.at(i)->getEmpid() << ","
              << employee_list.at(i)->getName() << ","
              << employee_list.at(i)->getSalary() << endl;
    }
    fout1.close();

    ofstream fout2("../data/Students.txt");
    for (int i = 0; i < student_list.size(); i++)
    {
        fout2 << student_list.at(i)->getRollno() << ","
              << student_list.at(i)->getName() << ","
              << student_list.at(i)->getMarks() << endl;
    }
    fout2.close();
}

int main()
{
    vector<Employee *> employee_list;
    vector<Student *> student_list;

    loadEmployeeData(employee_list);
    loadStudentData(student_list);

    Employee *eptr;
    Student *sptr;

    EMainMenu choice;
    while ((choice = menu()) != EXIT)
    {
        switch (choice)
        {
        case ADD_EMPLOYEE:
            eptr = new Employee;
            eptr->acceptData();
            employee_list.push_back(eptr);
            break;
        case ADD_STUDENT:
            sptr = new Student;
            sptr->acceptData();
            student_list.push_back(sptr);
            break;
        case DISPLAY_ALL_EMPLOYEES:
            for (int i = 0; i < employee_list.size(); i++)
            {
                employee_list.at(i)->printData();
                cout << "-------------------------" << endl;
            }
            break;
        case DISPLAY_ALL_STUDENTS:
            for (int i = 0; i < student_list.size(); i++)
            {
                student_list.at(i)->printData();
                cout << "-------------------------" << endl;
            }
            break;
        case FIND_EMPLOYEE:
        {
            int empid;
            cout << "Enter empid =";
            cin >> empid;
            for (int i = 0; i < employee_list.size(); i++)
                if (empid == employee_list.at(i)->getEmpid())
                    employee_list.at(i)->printData();
        }
        break;
        case FIND_STUDENT:
        {
            int rollno;
            cout << "Enter rollno =";
            cin >> rollno;
            for (int i = 0; i < student_list.size(); i++)
                if (rollno == student_list.at(i)->getRollno())
                    student_list.at(i)->printData();
        }
        break;

        default:
            cout << "Wrong choice...:(" << endl;
            break;
        }
    }
    saveData(employee_list, student_list);
    cout << "Thank you for using out app..:)" << endl;
    return 0;
}

// g++ invalid_data_exception.cpp person.cpp employee.cpp student.cpp main.cpp