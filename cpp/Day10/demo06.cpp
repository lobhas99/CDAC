#include <iostream>
using namespace std;

template <class T>
class Array
{
private:
    int size;
    T *ptr;
    int index;

public:
    Array(int size)
    {
        this->size = size;
        this->ptr = new T[this->size];
        this->index = 0;
    }

    void addElement(T element)
    {
        if (this->index < this->size)
        {
            this->ptr[this->index] = element;
            this->index++;
        }
        else
        {
            cout << "Array is full ..." << endl;
        }
    }

    T getElement(int index)
    {
        if (-1 < index < this->index)
            return this->ptr[index];
        return -1;
    }

    int getLength()
    {
        return this->index;
    }
    ~Array()
    {
        delete[] this->ptr;
    }
};

int main()
{
    Array<int> a1(5);
    a1.addElement(10);
    a1.addElement(20);

    for (int i = 0; i < a1.getLength(); i++)
        cout << "element at index " << i << "=" << a1.getElement(i) << endl;

    Array<double> a2(6);
    a2.addElement(10.20);
    a2.addElement(20.30);
    a2.addElement(30.40);
    a2.addElement(40.50);

    for (int i = 0; i < a2.getLength(); i++)
        cout << "element at index " << i << "=" << a2.getElement(i) << endl;
    return 0;
}