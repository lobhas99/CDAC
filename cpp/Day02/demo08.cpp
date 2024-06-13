#include <iostream>

namespace Na
{
    int num1 = 10;

    namespace Nb
    {
        int num1 = 100;
        int num2 = 20;
    }
}

using namespace Na;
int main()
{
    printf("value of num1 from Na = %d\n", num1);
    using namespace Nb;
    printf("value of num1 from Nb = %d\n", Nb::num1);
    printf("value of num2 from Nb = %d\n", Nb::num2);

    return 0;
}