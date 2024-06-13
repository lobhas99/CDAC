#include "../include/student.h"
#include "../include/invalid_data_exception.h"

Student::Student()
{
    this->rollno = 0;
    this->marks = 0;
}
Student::Student(int rollno, string name, double marks) : Person(name)
{
    this->rollno = rollno;
    this->marks = marks;
}
void Student::acceptData()
{
    cout << "Enter rollno = ";
    cin >> this->rollno;
    Person::acceptData();
    cout << "Enter marks = ";
    cin >> this->marks;
}
void Student::printData()
{
    cout << "Rollno = " << this->rollno << endl;
    cout << "Name = " << this->getName() << endl;
    cout << "Marks = " << this->marks << endl;
}
void Student::setRollno(int rollno)
{
    this->rollno = rollno;
}
void Student::setMarks(double marks)
{
    this->marks = marks;
}
int Student::getRollno()
{
    return this->rollno;
}
double Student::getMarks()
{
    return this->marks;
}