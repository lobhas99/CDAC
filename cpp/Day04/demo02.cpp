#include <iostream>
using namespace std;

class Circle
{
private:
    int radius;
    static double pi;

public:
    Circle()
    {
    }

    static double getpi()
    {
        return pi;
    }

    void calculateArea()
    {
        cout << "Enter radius = ";
        cin >> this->radius;
        cout << "Area of circle = " << pi * this->radius * this->radius << endl;
    }
};
double Circle::pi = 3.14;

int main()
{
    Circle::getpi();
    return 0;
}