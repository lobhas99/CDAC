#include <iostream>
using namespace std;

class Bank
{
private:
    int accno;
    string name;
    double balance;
    static int counter;

public:
    Bank()
    {
        this->accno = ++counter;
        this->name = "";
        this->balance = 0;
    }
    Bank(string name, double balance)
    {
        this->accno = ++counter;
        this->name = name;
        this->balance = balance;
    }

    static void getTotalAccounts()
    {
        cout << "total accounts =  " << counter - 1000 << endl;
    }

    void displayAccount() const
    {
        cout << "Accno = " << this->accno << endl;
        cout << "Name = " << this->name << endl;
        cout << "Balance = " << this->balance << endl;
    }
};
int Bank::counter = 1000;

int main()
{
    Bank a1;
    Bank a2("rohan", 1000);

    a1.displayAccount();
    a2.displayAccount();

    Bank::getTotalAccounts();
    return 0;
}