#include <iostream>
using namespace std;

int main()
{

    // case 1
    //  int arr[5];

    // case2
    // int *arr = new int[5];
    // arr[0] = 10;
    // arr[1] = 20;
    // arr[2] = 30;
    // arr[3] = 40;
    // arr[4] = 50;
    // delete[] arr;

    // case 3
    // int *arr[5];
    // arr[0] = new int;
    // arr[1] = new int;
    // arr[2] = new int;
    // arr[3] = new int;
    // arr[4] = new int;
    // for (int i = 0; i < 5; i++)
    //     delete arr[i];

    // case 4
    int **arr = new int *[5];
    arr[0] = new int;
    arr[1] = new int;
    arr[2] = new int;
    arr[3] = new int;
    arr[4] = new int;
    for (int i = 0; i < 5; i++)
        delete arr[i];
    delete[] arr;

    return 0;
}