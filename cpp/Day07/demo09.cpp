#include <iostream>
using namespace std;
class Point
{
private:
    int x_axis;
    int y_axis;

public:
    Point()
    {
        this->x_axis = 1;
        this->y_axis = 1;
    }

    Point(int x_axis, int y_axis)
    {
        this->x_axis = x_axis;
        this->y_axis = y_axis;
    }

    void displayPoint()
    {
        cout << "Point = (" << this->x_axis << "," << this->y_axis << ")" << endl;
    }
    Point operator+(Point other)
    {
        // p1-> this
        // p2-> other
        Point p;
        p.x_axis = this->x_axis + other.x_axis;
        p.y_axis = this->y_axis + other.y_axis;
        return p;
    }
};

int main()
{

    // int num1 = 10;
    // int num2 = 20;
    // int num3 = num1 + num2;

    cout << "Operator overloading using member function" << endl;
    Point p1;
    p1.displayPoint();
    Point p2(2, 4);
    p2.displayPoint();

    Point p3 = p1 + p2; // p1.operator+(p2)
    p3.displayPoint();
    return 0;
}