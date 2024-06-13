#include <iostream>
using namespace std;

class Base1
{
protected:
    int num1;

public:
    Base1()
    {
        cout << "Base1::Ctor" << endl;
        this->num1 = 10;
    }
};

class Base2
{
protected:
    int num2;

public:
    Base2()
    {
        cout << "Base2::Ctor" << endl;
        this->num2 = 20;
    }
};

class Derived : public Base1, public Base2
{
public:
    Derived()
    {
        cout << "Derived::Ctor" << endl;
    }
    void displayDerived()
    {
        cout << "derived num1 - " << num1 << endl;
        cout << "derived num2 - " << num2 << endl;
    }
};
class IndirectDerived : public Derived
{
public:
    IndirectDerived()
    {
        cout << "IndirectDerived Ctor" << endl;
    }
};

int main()
{

    // Derived d1;
    // d1.displayDerived();

    IndirectDerived id;

    return 0;
}