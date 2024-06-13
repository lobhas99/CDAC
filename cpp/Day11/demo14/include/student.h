#ifndef STUDENT_H
#define STUDENT_H
#include "./person.h"
class Student : public Person
{
private:
    int rollno;
    double marks;

public:
    Student();
    Student(int rollno, string name, double marks);
    void acceptData();
    void printData();
    void setRollno(int rollno);
    void setMarks(double marks);
    int getRollno();
    double getMarks();
};

#endif