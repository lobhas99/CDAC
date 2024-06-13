#include <iostream>

namespace Na
{
    int num1 = 10;

    namespace Nb
    {
        int num1 = 100;
        int num2 = 20;
    }
    namespace Nc
    {
        int num1 = 200;
        int num3 = 30;
    }

}

int main()
{
    printf("value of num1 from Na = %d\n", Na::num1);
    printf("value of num1 from Nb = %d\n", Na::Nb::num1);
    printf("value of num1 from Nc = %d\n", Na::Nc::num1);
    printf("value of num2 = %d\n", Na::Nb::num2);
    printf("value of num3 = %d\n", Na::Nc::num3);
    return 0;
}