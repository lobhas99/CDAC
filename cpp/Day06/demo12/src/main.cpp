#include "../include/rectangle.h"
#include "../include/circle.h"

int menu()
{
    int choice;
    cout << "0.EXIT" << endl;
    cout << "1.Area of Rectangle" << endl;
    cout << "2.Area of Circle" << endl;
    cout << "Enter your choice = ";
    cin >> choice;
    return choice;
}

int main()
{
    int choice;
    Shape *shape = NULL;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            shape = new Rectangle();
            break;
        case 2:
            shape = new Circle();
            break;
        default:
            cout << "Wrong Choice.." << endl;
            break;
        }
        if (shape != NULL)
        {
            shape->acceptData();
            shape->calculateArea();
            delete shape;
            shape = NULL;
        }
    }

    return 0;
}