#include <iostream>

namespace Na // Na namespace scope
{
    int num1 = 30;
    void fun1()
    {
        printf("Inside fun1\n");
    }
    class Complex
    {
        int real;
        int imag;

    public:
        void display()
        {
            printf("real and imag\n");
        }
    };
}

using namespace Na;
int main()
{
    printf("value of Na num1 = %d\n", num1);
    fun1();
    Complex c;
    c.display();
    return 0;
}