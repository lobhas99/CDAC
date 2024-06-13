#include <iostream>
using namespace std;

template <class X, class Y>
class Point
{
private:
    X x_axis;
    Y y_axis;

public:
    Point(X x_axis, Y y_axis)
    {
        this->x_axis = x_axis;
        this->y_axis = y_axis;
    }

    void printPoint()
    {
        cout << "Point (" << this->x_axis << "," << this->y_axis << ")" << endl;
    }
};

int main()
{
    Point<int, double> p1(2, 3.2);
    p1.printPoint();

    Point<double, char> p2(2.5, 'A');
    p2.printPoint();

    Point<char, int> p3('A', 10);
    p3.printPoint();

    return 0;
}