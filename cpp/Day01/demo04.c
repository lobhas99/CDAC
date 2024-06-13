#include <stdio.h>

struct Time
{
    int hrs;
    int mins;
};

void acceptTime(struct Time *t)
{
    printf("Enter the hrs and mins = ");
    scanf("%d%d", &t->hrs, &t->mins);
}
void printTime(struct Time t)
{
    printf("Time = %d : %d \n", t.hrs, t.mins);
}

int main()
{
    struct Time t1;
    acceptTime(&t1);
    printTime(t1);
    return 0;
}
