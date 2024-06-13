#include <iostream>
using namespace std;
int num5;

class Outer
{
private:
    int num1;
    static int num2;

public:
    class Inner
    {
    private:
        int num3;
        static int num4;

    public:
        void acceptInner()
        {
            cout << "Inner :: accept" << endl;
        }
        void printInner()
        {
            cout << "Inner :: print" << endl;
            Outer o1;
            cout << o1.num1 << o1.num2 << endl;
            cout << num5 << num2 << endl;
            cout << num3 << num4 << endl;
        }
    };

    void acceptOuter()
    {
        cout << "Outer :: accept" << endl;
    }
    void printOuter()
    {
        cout << "Outer :: print" << endl;
        cout << num1 << num2 << endl;
        Inner i1;
        cout << i1.num3 << i1.num4 << endl;
        cout << num3 << num4 << endl;
    }
};

int main()
{
    Outer o1;
    o1.acceptOuter();
    o1.printOuter();
    Outer::Inner i1;
    i1.acceptInner();
    i1.printInner();
    return 0;
}