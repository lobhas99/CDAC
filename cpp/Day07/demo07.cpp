#include <iostream>
using namespace std;

class A
{
private:
    int num1;
    int num2;

public:
    void printA()
    {
        cout << num1 << num2 << endl;
    }
    friend class B;
};

class B
{

public:
    void printB()
    {
        A obj;
        cout << obj.num1 << obj.num2;
    }
};

int main()
{

    return 0;
}