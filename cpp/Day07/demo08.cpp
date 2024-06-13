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
    friend Point operator+(Point p1, Point p2);
};

Point operator+(Point p1, Point p2)
{
    Point p3;
    // p3.setX_axis(p1.getX_axis()+p2.getX_axis());
    p3.x_axis = p1.x_axis + p2.x_axis;
    p3.y_axis = p1.y_axis + p2.y_axis;
    return p3;
}

int main()
{

    // int num1 = 10;
    // int num2 = 20;
    // int num3 = num1 + num2;

    Point p1;
    p1.displayPoint();
    Point p2(2, 4);
    p2.displayPoint();

    Point p3 = p1 + p2; // operator+(p1,p2)
    p3.displayPoint();
    return 0;
}