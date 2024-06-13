#include <iostream>
using namespace std;

class Base // Parent
{
protected:
    int num1;

public:
    Base()
    {
        cout << "Inside Base::Ctor" << endl;
        this->num1 = 10;
    }
    void displayNum1()
    {
        cout << "Num1 = " << this->num1 << endl;
    }
};

class Derived : Base // child
{
private:
    int num2;

public:
    Derived()
    {
        cout << "Inside Derived::Ctor" << endl;
        this->num2 = 20;
    }

    void displayNum2()
    {
        cout << "Num2 = " << this->num2 << endl;
        cout << "Num1 from base= " << this->num1 << endl;
    }
};

int main()
{
    // Base b;
    // b.displayNum1();
    Derived d;
    d.displayNum2();
    return 0;
}