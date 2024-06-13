#include <iostream>
using namespace std;

class Point
{
private:
    int x_axis;
    int y_axis;

public:
    void acceptPoint()
    {
        cout << "Enter value of point on x axis = ";
        cin >> this->x_axis;
        cout << "Enter value of point on y axis = ";
        cin >> this->y_axis;
    }
    void displayPoint()
    {
        cout << "Point = (" << this->x_axis << "," << this->y_axis << ")" << endl;
    }
};

int menu()
{
    int choice;
    cout << "0. EXIT" << endl;
    cout << "1. Add Point" << endl;
    cout << "2. Display All points" << endl;
    cout << "Enter your choice = ";
    cin >> choice;
    return choice;
}

int main()
{
    int choice;
    Point arr[5];
    int index = 0;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            if (index < 5)
            {
                arr[index].acceptPoint();
                index++;
            }
            else
                cout << "Array is full" << endl;
            break;
        case 2:
            cout << "----------------------" << endl;
            for (int i = 0; i < index; i++)
                arr[i].displayPoint();
            cout << "----------------------" << endl;
            break;
        default:
            cout << "wrong choice..." << endl;
            break;
        }
    }

    return 0;
}