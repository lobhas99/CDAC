#ifndef BANK_H
#define BANK_H
#include <iostream>
using namespace std;
class Bank
{
private:
    const int accno;
    string name;
    double balance;
    static int generate_accno;

public:
    Bank();
    int getAccno() const;
    void acceptData();
    void displayAccount() const;
    void doTransaction(bool status);
};

#endif