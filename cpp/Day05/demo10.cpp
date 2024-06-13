#include <iostream>
using namespace std;

class A
{
public:
    int num1;
    A()
    {
        cout << "A::Ctor" << endl;
    }
    void printA()
    {
        cout << num1 << endl;
    }
};

class B : virtual public A
{
public:
    int num2;
    B()
    {
        cout << "B::Ctor" << endl;
    }
    void printB()
    {
        cout << num1 << num2 << endl;
    }
};

class C : virtual public A
{
public:
    int num3;
    C()
    {
        cout << "C::Ctor" << endl;
    }
    void printC()
    {
        cout << num1 << num3 << endl;
    }
};

class D : public B, public C
{
public:
    int num4;
    D()
    {
        cout << "D::Ctor" << endl;
    }
    void printD()
    {
        // cout << num1 << num2 << num3 << num4 << endl;
    }
};

int main()
{
    D d;
    return 0;
}