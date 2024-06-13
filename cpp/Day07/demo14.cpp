#include <iostream>
using namespace std;

class Time
{
private:
    int hr;
    int min;

public:
    Time()
    {
        cout << "Inside parameterless ctor" << endl;
        this->hr = 0;
        this->min = 0;
    }

    Time(int value)
    {
        cout << "Inside single Parameterized ctor" << endl;
        this->hr = value / 60;
        this->min = value % 60;
    }

    Time(int hr, int min)
    {
        cout << "Inside parameterized ctor" << endl;
        this->hr = hr;
        this->min = min;
    }

    void displayTime()
    {
        cout << "Time = " << this->hr << ":" << this->min << endl;
    }

    operator int()
    {
        return (this->hr * 60 + this->min);
    }
};

int main()
{
    Time t1(2, 30); // parameterized ctor;
    int mins = t1;
    cout << "Total mins = " << mins << endl;

    Time t2(120); // single parameterized ctor
    t2.displayTime();

    Time t3; // parameterless ctor
    t3 = 120;
    t3.displayTime();

    return 0;
}