#include <iostream>
using namespace std;
namespace NTime
{
    class Time
    {
    private:
        int hrs;
        int mins;

    public:
        void acceptTime()
        {
            cout << "Enter hrs = ";
            cin >> hrs;
            cout << "Enter mins = ";
            cin >> mins;
        }

        void displayTime()
        {
            cout << "Time = " << hrs << " : " << mins << endl;
        }
    };

    int menu()
    {
        int choice;
        cout << "0. EXIT" << endl;
        cout << "1. Accept Time" << endl;
        cout << "2. Display Time" << endl;
        cout << "Enter the choice = ";
        cin >> choice;
        return choice;
    }
}
using namespace NTime;
int main()
{
    Time t;
    int choice;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            t.acceptTime();
            break;
        case 2:
            t.displayTime();
            break;
        default:
            cout << "Wrong choice entered ...:(" << endl;
            break;
        }
    }
    cout << "Thank you for using our app" << endl;
    return 0;
}