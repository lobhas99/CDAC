#include <iostream>
int num1 = 20;
namespace Na
{
    int num1 = 10;
}
using namespace Na;
int main()
{
    // int num1 = 30;
    printf("value of num1 from global = %d\n", ::num1);
    printf("value of num1 from Na = %d\n", Na::num1);

    return 0;
}