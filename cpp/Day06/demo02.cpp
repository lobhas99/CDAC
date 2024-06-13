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
    Dervied d;
    Base &ref = d; // upcasting

    // d.f1();
    // d.f2();
    // d.f3();

    ref.f1();
    ref.f2();
    // ref.f3(); //NOT OK-> Object Slicing

    d.f3();
    return 0;
}