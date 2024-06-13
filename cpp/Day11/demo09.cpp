#include <iostream>
using namespace std;
namespace Na
{
    int num1 = 10;
    namespace Nb
    {
        int num2 = 20;
    }
    namespace Nc
    {
        int num3 = 30;
    }
}

int main()
{
    cout << "num1 = " << Na::num1 << endl;
    cout << "num2 = " << Na::Nb::num2 << endl;
    cout << "num3 = " << Na::Nc::num3 << endl;
    return 0;
}