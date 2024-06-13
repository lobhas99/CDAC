#include <iostream>
using namespace std;
class Shape
{
protected:
    double area;

public:
    virtual void acceptData() = 0;
    virtual void calculateArea() = 0;
    virtual void displayArea()
    {
        cout << "Area = " << this->area << endl;
    }
};

class Rectnagle : public Shape
{
private:
    int length;
    int breadth;

public:
    void acceptData()
    {
        cout << "Enter length and breadth = ";
        cin >> this->length >> this->breadth;
    }
    void calculateArea()
    {
        this->area = this->length * this->breadth;
    }
    void displayArea()
    {
        cout << "Area of rectangle = " << this->area << endl;
    }
    void calculatePerimeter()
    {
        cout << "Perimeter of Rectangle  = " << 2 * (this->length + this->breadth) << endl;
    }
};

class Circle : public Shape
{
private:
    int radius;

public:
    void acceptData()
    {
        cout << "Enter radius = ";
        cin >> this->radius;
    }
    void calculateArea()
    {
        this->area = 3.14 * this->radius * this->radius;
    }
};

int main()
{
    Shape *shape = new Rectnagle(); // upcasting
    shape->acceptData();
    shape->calculateArea();
    shape->displayArea();

    Rectnagle *rectnagle = dynamic_cast<Rectnagle *>(shape); // Downcasting
    if (rectnagle != NULL)
        rectnagle->calculatePerimeter();
    return 0;
}