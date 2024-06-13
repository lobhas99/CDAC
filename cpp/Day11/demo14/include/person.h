#ifndef PERSON_H
#define PERSON_H
#include <iostream>
using namespace std;

class Person
{
private:
    string name;

public:
    Person();
    Person(string name);
    void acceptData();
    void printData();
    void setName(string name);
    string getName();
};
#endif