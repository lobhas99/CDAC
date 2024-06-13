#include <stdio.h>

int num1 = 10;
// int num1 = 30;

int main()
{
    int num1 = 20;
    printf("value of local num1 = %d\n", num1);
    {
        extern int num1;
        printf("value of global num1 = %d\n", num1);
    }

    return 0;
}