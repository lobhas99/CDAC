#include <iostream>
using namespace std;

int main()
{
    int arr[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    // cout << "arr[0] = " << arr[0] << endl;
    // cout << "arr[1] = " << arr[1] << endl;
    // cout << "arr[2] = " << arr[2] << endl;
    // cout << "arr[3] = " << arr[3] << endl;
    // cout << "arr[4] = " << arr[4] << endl;

    for (int i = 0; i < 5; i++)
    {
        cout << "arr[" << i << "] = " << arr[i] << endl;
    }

    int arr2[2][3];
    arr2[0][0] = 10;
    arr2[0][1] = 20;
    arr2[0][2] = 30;
    arr2[1][0] = 40;
    arr2[1][1] = 50;
    arr2[1][2] = 60;

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << "arr2[" << i << "][" << j << "] = " << arr2[i][j] << endl;
        }
    }
}