#include <iostream>
using namespace std;

class Base
{
protected:
    int num1;

public:
    Base()
    {
        cout << "Base::Ctor" << endl;
        this->num1 = 10;
    }
    void displayBase()
    {
        cout << "base num1 - " << num1 << endl;
    }
};

class Derived1 : public Base
{

public:
    Derived1()
    {
        cout << "Derived1::Ctor" << endl;
    }
    void displayDerived1()
    {
        cout << "derived1 num1 - " << num1 << endl;
    }
};

class Derived2 : public Base
{
public:
    Derived2()
    {
        cout << "Derived2::Ctor" << endl;
    }
    void displayDerived2()
    {
        cout << "derived2 num1 - " << num1 << endl;
    }
};

class IndirectDerived : public Derived2
{
public:
    IndirectDerived()
    {
        cout << "IndirectDerived Ctor" << endl;
    }
};

int main()
{
    // Base b;
    // b.displayBase();

    // Derived1 d1;
    // d1.displayDerived1();

    // Derived2 d2;
    // d2.displayDerived2();

    IndirectDerived id;

    return 0;
}