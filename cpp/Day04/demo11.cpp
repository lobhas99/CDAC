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
    Bank() : accno(++generate_accno)
    {
        this->name = "";
        this->balance = 0;
    }

    int getAccno() const
    {
        return this->accno;
    }

    void acceptData()
    {
        cout << "Enter the name = ";
        cin >> this->name;
        cout << "Enter the balance = ";
        cin >> this->balance;

        cout << "Account cretated successfully ...." << endl;
        cout << "Your Accno = " << this->accno << endl;
    }

    void displayAccount() const
    {
        cout << "Accno = " << this->accno << endl;
        cout << "Name = " << this->name << endl;
        cout << "Balance = " << this->balance << endl;
    }

    void doTransaction(bool status)
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
};

int Bank::generate_accno = 1000;

int menu()
{
    int choice;
    cout << "---------------------------" << endl;
    cout << "0.EXIT" << endl;
    cout << "1.Create Account" << endl;
    cout << "2.Display Specific Account" << endl;
    cout << "3.Deposit" << endl;
    cout << "4.Withdraw" << endl;
    cout << "Enter your choice = ";
    cin >> choice;
    cout << "---------------------------" << endl;

    return choice;
}

int main()
{
    Bank arr[5];
    int index = 0;
    int accno;
    int choice;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            if (index < 5)
            {
                arr[index].acceptData();
                index++;
            }
            else
                cout << "no new Accounts can be creted.." << endl;
            break;
        case 2:
            cout << "Enter accno = ";
            cin >> accno;
            for (int i = 0; i < index; i++)
                if (accno == arr[i].getAccno())
                    arr[i].displayAccount();
            break;
        case 3:
            cout << "Enter accno = ";
            cin >> accno;
            for (int i = 0; i < index; i++)
                if (accno == arr[i].getAccno())
                    arr[i].doTransaction(true);
            break;
        case 4:
            cout << "Enter accno = ";
            cin >> accno;
            for (int i = 0; i < index; i++)
                if (accno == arr[i].getAccno())
                    arr[i].doTransaction(false);
            break;
        default:
            cout << "Wrong choice .." << endl;
            break;
        }
    }

    return 0;
}