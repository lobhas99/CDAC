#include <iostream>
using namespace std;

class Calculator
{
private:
    int num1;
    int num2;

public:
    Calculator(int num1, int num2)
    {
        this->num1 = num1;
        this->num2 = num2;
    }
    void add()
    {
        cout << "Addition = " << this->num1 + this->num2 << endl;
    }
    void sub()
    {
        if (this->num2 > this->num1)
            throw 5;
        cout << "Substraction = " << this->num1 - this->num2 << endl;
    }
    void mul()
    {
        if (this->num1 == 0 || this->num2 == 0)
            throw 5.3f;
        cout << "Multiplication = " << this->num1 * this->num2 << endl;
    }
    void div()
    {
        if (this->num2 == 0)
            throw 'a';
        cout << "Division = " << this->num1 / this->num2 << endl;
    }
};

int main()
{
    Calculator c1(5, 0);
    // c1.add();
    try
    {
        c1.sub();
        c1.mul();
        c1.div();
    }
    catch (...) // Generic Catch Block
    {
        cout << "Error - Calculation is not possible" << endl;
        cout << "Msg - something went wrong " << endl;
    }

    return 0;
}
