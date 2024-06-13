#include <iostream>
using namespace std;
namespace Na::Nb
{
    int num2 = 20;
}

namespace Na::Nc
{
    int num3 = 30;
}

int main()
{
    cout << "num2 = " << Na::Nb::num2 << endl;
    cout << "num3 = " << Na::Nc::num3 << endl;
    return 0;
}