#include <iostream>

int num1 = 10; // global namespace scope

namespace Na // Na namespace scope
{
    int num1 = 30;
}

int main()
{
    int num1 = 20;
    printf("value of local num1 = %d\n", num1);
    printf("value of global num1 = %d\n", ::num1);
    printf("value of Na num1 = %d\n", Na::num1);

    return 0;
}