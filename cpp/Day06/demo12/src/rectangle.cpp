#include "../include/rectangle.h"

void Rectangle::acceptData()
{
    cout << "Enter the length = ";
    cin >> this->length;
    cout << "Enter the breadth = ";
    cin >> this->breadth;
}

void Rectangle::calculateArea()
{
    cout << "Area of rectangle = " << this->length * this->breadth << endl;
}