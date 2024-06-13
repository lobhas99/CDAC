#include <iostream>
using namespace std;

class Shape
{
private:
    double area;

public:
    virtual void acceptData() = 0;
    virtual void calculateArea() = 0;
    virtual void displayArea()
    {
        cout << " Area = " << this->area << endl;
    }
    void setArea(double area)
    {
        this->area = area;
    }
    double getArea()
    {
        return this->area;
    }
};

class Rectangle : public Shape
{
private:
    int length;
    int breadth;

public:
    void acceptData()
    {
        cout << "Enter the length = ";
        cin >> this->length;
        cout << "Enter the breadth = ";
        cin >> this->breadth;
    }

    void calculateArea()
    {
        this->setArea(this->length * this->breadth);
    }
};

class Circle : public Shape
{
private:
    int radius;

public:
    void acceptData()
    {
        cout << "Enter the radius = ";
        cin >> this->radius;
    }

    void calculateArea()
    {
        this->setArea(3.14 * this->radius * this->radius);
    }
    void displayArea()
    {
        cout << " Area of cirlce = " << this->getArea() << endl;
    }
};

int menu()
{
    int choice;
    cout << "0.EXIT" << endl;
    cout << "1.Area of Rectangle" << endl;
    cout << "2.Area of Circle" << endl;
    cout << "Enter your choice = ";
    cin >> choice;
    return choice;
}

int main()
{
    int choice;
    Shape *shape = NULL;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            shape = new Rectangle();
            break;
        case 2:
            shape = new Circle();
            break;
        default:
            cout << "Wrong Choice.." << endl;
            break;
        }
        if (shape != NULL)
        {
            shape->acceptData();
            shape->calculateArea();
            shape->displayArea(); // call the new displayArea() here.
            delete shape;
            shape = NULL;
        }
    }

    return 0;
}