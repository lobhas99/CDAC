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
            throw 145;
        cout << "Substraction = " << this->num1 - this->num2 << endl;
    }
    void mul()
    {
        if (this->num1 == 0 || this->num2 == 0)
            throw 200;
        cout << "Multiplication = " << this->num1 * this->num2 << endl;
    }
    void div()
    {
        if (this->num2 == 0)
            throw 367;
        cout << "Division = " << this->num1 / this->num2 << endl;
    }
};

int main()
{
    Calculator c1(0, 5);
    // c1.add();
    try
    {
        // c1.sub();
        c1.mul();
        c1.div();
    }
    catch (int error)
    {
        cout << "Error code -  " << error << endl;
        if (error == 145)
        {
            cout << "Error - Substraction is not possible" << endl;
            cout << "Msg - num2 is greater than num1 " << endl;
        }
        else if (error == 200)
        {
            cout << "Error - Multiplication is not possible" << endl;
            cout << "Msg - num1 or num2 is 0 " << endl;
        }
        else
        {
            cout << "Error - Division is not possible" << endl;
            cout << "Msg - Denominator(num2) is 0 " << endl;
        }
    }

    return 0;
}
