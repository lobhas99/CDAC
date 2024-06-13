#include "../include/person.h"
Person::Person()
{
    this->name = "";
}
Person::Person(string name)
{
    this->name = name;
}
void Person::acceptData()
{
    cout << "Enter the name = ";
    cin >> this->name;
}
void Person::printData()
{
    cout << "Name = " << this->name;
}

void Person::setName(string name)
{
    this->name = name;
}
string Person::getName()
{
    return this->name;
}