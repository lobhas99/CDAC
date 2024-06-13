#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    string msg = "Hello";
    ofstream fout("./file1.txt", ios::app);
    fout << msg << endl;
    fout.close();
    return 0;
}