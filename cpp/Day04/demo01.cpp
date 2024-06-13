#include <iostream>
using namespace std;

class Bank
{
private:
    const int accno;
    string name;
    double balance;

public:
    Bank(int accno) : accno(accno)
    {
        this->name = "";
        this->balance = 0;
    }
    Bank(int accno, string name, double balance) : accno(accno)
    {
        this->name = name;
        this->balance = balance;
    }

    void acceptData()
    {
        cout << "Enter the name = ";
        cin >> this->name;
        cout << "Enter the baance = ";
        cin >> this->balance;
    }

    void displayAccount() const
    {
        cout << "Accno = " << this->accno << endl;
        cout << "Name = " << this->name << endl;
        cout << "Balance = " << this->balance << endl;
    }
};

int main()
{
    int accno;
    cout << "Enter accno = ";
    cin >> accno;

    Bank a1(accno);
    Bank a2(1002);
    Bank a3(1003, "rohan", 1000);
    Bank a4(1004, "rajiv", 2000);
    a1.displayAccount();
    a2.displayAccount();
    a3.displayAccount();
    a4.displayAccount();

    a1.acceptData();
    a2.acceptData();
    return 0;
}