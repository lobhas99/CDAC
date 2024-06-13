#include <iostream>

struct Time
{
    int hrs;
    int mins;

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
    struct Time t1;
    t1.acceptTime();
    t1.printTime();
    // acceptTime(&t1);
    // printTime(t1);
    return 0;
}