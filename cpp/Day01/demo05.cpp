#include <iostream>

struct Time
{
private:
    int hrs;
    int mins;

public:
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
    // t1.hrs = 12; // NOT ALLOWED
    t1.printTime();
    return 0;
}