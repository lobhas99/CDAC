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
    Base *bptr = new Dervied(); // upcasting
    bptr->f1();
    bptr->f2();
    // bptr->f3(); NOT OK -> Object slicing
    Dervied *dptr = (Dervied *)bptr; // Downcasting
    dptr->f3();

    delete bptr;

    return 0;
}