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

int main()
{
    // Shape *shape = new Rectangle[3]; // NOT OK

    Shape *shape[3];
    shape[0] = new Rectangle();
    shape[1] = new Rectangle();
    shape[2] = new Rectangle();

    for (int i = 0; i < 3; i++)
    {
        shape[i]->acceptData();
        shape[i]->calculateArea();
        shape[i]->displayArea();
    }
    for (int i = 0; i < 3; i++)
        delete shape[i];

    return 0;
}