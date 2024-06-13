#include <iostream>

class Time
{
private:
    // Data members
    int hrs;
    int mins;

public:
    // Member Functions
    void acceptTime()
    {
        printf("Enter the hrs and mins = ");
        scanf("%d%d", &hrs, &mins);
    }
    void printTime()
    {
        printf("Time = %d : %d \n", hrs, mins);
    }
};

int main()
{
    Time t1; // Object of class
    t1.acceptTime();
    t1.printTime();
    return 0;
}