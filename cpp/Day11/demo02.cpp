#include <iostream>
#include <fstream>
using namespace std;
void writeIntoFile()
{
    string name;
    cout << "Enter the course name = ";
    cin >> name;
    ofstream fout("./file2.txt", ios::app);
    fout << name << endl;
    fout.close();
}

void readFromFile()
{
    ifstream fin("./file2.txt");
    string line;
    while (getline(fin, line))
    {
        cout << line << endl;
    }

    fin.close();
}
int main()
{
    // writeIntoFile();
    readFromFile();
    return 0;
}