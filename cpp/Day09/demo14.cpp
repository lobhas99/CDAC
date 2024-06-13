#include <iostream>
using namespace std;

template <class T>
class Point
{
private:
    T x_axis;
    T y_axis;

public:
    Point(T x_axis, T y_axis)
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
    Point<int> p1(2, 3);
    p1.printPoint();

    Point<double> p2(2.5, 3.2);
    p2.printPoint();

    Point<char> p3('A', 'B');
    p3.printPoint();

    return 0;
}