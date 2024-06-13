#include <iostream>
using namespace std;

int main()
{
    int arr[3] = {10, 20, 30};
    int(&ref)[] = arr;
    cout << ref[0] << endl;
    return 0;
}