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
    virtual void f2()
    {
        cout << "Incomplete Inside Base::f2()" << endl;
    }
};

class Dervied : public Base
{
public:
    Dervied()
    {
        cout << "Inside Derived::ctor" << endl;
    }
    // function overriding
    // void f2()
    // {
    //     cout << "Derived::f2()" << endl;
    // }
    void f3()
    {
        cout << "Inside Dervied::f3()" << endl;
    }
};

int main()
{
    Base *bptr = new Dervied(); // upcasting
    bptr->f2();                 // Base::f2() -> Late Binding
    delete bptr;
    return 0;
}