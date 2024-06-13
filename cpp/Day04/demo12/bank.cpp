#include "bank.h"
Bank::Bank() : accno(++generate_accno)
{
    this->name = "";
    this->balance = 0;
}

int Bank::getAccno() const
{
    return this->accno;
}

void Bank::acceptData()
{
    cout << "Enter the name = ";
    cin >> this->name;
    cout << "Enter the balance = ";
    cin >> this->balance;

    cout << "Account cretated successfully ...." << endl;
    cout << "Your Accno = " << this->accno << endl;
}

void Bank::displayAccount() const
{
    cout << "Accno = " << this->accno << endl;
    cout << "Name = " << this->name << endl;
    cout << "Balance = " << this->balance << endl;
}

void Bank::doTransaction(bool status)
{
    int amount;
    cout << "Enter the amount = ";
    cin >> amount;
    if (status)
        this->balance = this->balance + amount;
    else
        this->balance = this->balance - amount;

    cout << "Updated balance = " << this->balance << endl;
}
int Bank::generate_accno = 1000;