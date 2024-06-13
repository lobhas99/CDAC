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
    void accept()
    {
        cout << "Enter num1 = ";
        cin >> this->num1;
        cout << "Enter num2 = ";
        cin >> this->num2;
    }
};

int main()
{
    Calculator c1(0, 5);
    // c1.add();
    try
    {
        c1.sub();
        c1.mul();
        c1.div();
    }
    catch (int error)
    {
        cout << "Error - Substraction is not possible" << endl;
        cout << "Please enter num1 value greater than num2 " << endl;
        c1.accept();
        try
        {
            c1.sub();
        }
        catch (int error)
        {
            cout << "Error - Substraction is not possible" << endl;
            cout << "Msg - Entered greater value for num2 than num1" << endl;
        }
    }
    catch (float error)
    {
        cout << "Error - Multiplication is not possible" << endl;
        cout << "Please enter num1 and num2 non zero values" << endl;
        c1.accept();
        c1.mul();
    }
    catch (char error)
    {
        cout << "Error - Division is not possible" << endl;
        cout << "please enter num2 value as non zero" << endl;
        c1.accept();
        c1.div();
    }
    return 0;
}
