#include <iostream>
using namespace std;

class Array
{
private:
    int size;
    int *ptr;
    int index;

public:
    Array(int size)
    {
        ptr = new int[this->size];
        this->index = 0;
    }

    void addElement(int element)
    {
    }

    int getElement(int index)
    {
    }

    void displayArray()
    {
    }

    void deleteElement(int index)
    {
    }
};

int main()
{

    return 0;
}