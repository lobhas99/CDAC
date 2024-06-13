#include <iostream>
using namespace std;

class Shape
{
    double area;

public:
    Shape()
    {
        cout << "Inside Shape Ctor" << endl;
    }
    void setArea(double area)
    {
        this->area = area;
    }
    double getArea()
    {
        return this->area;
    }
    virtual void acceptData() = 0;
    virtual void calculateArea() = 0;
    virtual void displayArea()
    {
        cout << "Area = " << this->area << endl;
    }
    virtual ~Shape()
    {
        cout << "Inside Shape Dtor" << endl;
    }
};

class Rectangle : public Shape
{
    int length;
    int breadth;

public:
    Rectangle()
    {
        cout << "Inside Rectangle ctor" << endl;
    }
    // function overriding
    void acceptData()
    {
        cout << "Enter the length and breadth = ";
        cin >> this->length >> this->breadth;
    }
    void calculateArea()
    {
        this->setArea(this->length * this->breadth);
    }

    void displayArea()
    {
        cout << "Rectangle Area = " << this->getArea() << endl;
    }

    void perimeterofRectangle()
    {
        cout << "Perimeter of Rect = " << 2 * (this->length + this->breadth) << endl;
    }
    ~Rectangle()
    {
        cout << "Inside Rectangle Dtor" << endl;
    }
};

// to construct circle class properly its as assignment for you
class Circle
{
    int radius;

public:
    void acceptRectangle()
    {
        cout << "Enter the radius ";
        cin >> this->radius;
    }
    void calculateRectnagleArea()
    {
        cout << "Area of Circle  = " << 3.14 * this->radius * this->radius << endl;
    }
};

int main()
{
    Shape *shape = new Rectangle; // upcasting
    shape->acceptData();
    shape->calculateArea();
    shape->displayArea();
    Rectangle *rptr = (Rectangle *)shape;
    rptr->perimeterofRectangle();

    delete shape;
    return 0;
}