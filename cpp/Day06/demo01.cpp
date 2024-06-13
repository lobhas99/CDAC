#include <iostream>
using namespace std;
class Base
{
public:
    Base()
    {
        cout << "Inside Base::Ctor" << endl;
    }

    void f1()
    {
        cout << "Inside Base::f1()" << endl;
    }
    void f2()
    {
        cout << "Inside Base::f2()" << endl;
    }
};

class Dervied : public Base
{
public:
    Dervied()
    {
        cout << "Inside Derived::ctor" << endl;
    }
    void f3()
    {
        cout << "Inside Dervied::f3()" << endl;
    }
};

int main()
{
    // Base b;
    // b.f1();
    // b.f2();

    Dervied d;
    d.f3();
    d.f1();
    d.f2();

    return 0;
}