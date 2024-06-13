#include "../include/circle.h"

void Circle::acceptData()
{
    cout << "Enter the radius = ";
    cin >> this->radius;
}

void Circle::calculateArea()
{
    cout << "Area of circle = " << 3.14 * this->radius * this->radius << endl;
}
