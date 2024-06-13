#include <iostream>
using namespace std;

// abstract class
class Base
{
public:
    // pure virtual function
    virtual void f1() = 0;
    virtual void f2()
    {
        cout << "Incomplete Inside Base::f2()" << endl;
    }
};

class Dervied : public Base
{
public:
    void f1()
    {
        cout << "Implementation of f1()" << endl;
    }
    void f2()
    {
        cout << "Complete Inside Derived::f2()" << endl;
    }
    void f3()
    {
        cout << "Derived::f2()" << endl;
    }
};

int main()
{
    Base *bptr = new Dervied(); // upcasting
    bptr->f2();                 // Base::f2()
    bptr->f1();
    delete bptr;
    return 0;
}