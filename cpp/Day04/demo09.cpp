#include <iostream>
using namespace std;

class Complex
{
private:
    int *rptr;
    int *iptr;

public:
    Complex()
    {

        this->rptr = new int;
        this->iptr = new int;
        *this->rptr = 10;
        *this->iptr = 20;
    }

    Complex(int real, int imag)
    {
        this->rptr = new int;
        *this->rptr = real;
        this->iptr = new int;
        *this->iptr = imag;
    }

    void printComplex()
    {
        cout << "real = " << *this->rptr << endl;
        cout << "imag = " << *this->iptr << endl;
    }

    // void deallocateMemory()
    // {
    //     delete this->rptr;
    //     delete this->iptr;
    // }
    ~Complex()
    {
        delete this->rptr;
        delete this->iptr;
    }
};

int main()
{
    Complex c1;
    c1.printComplex();

    Complex c2(30, 40);
    c2.printComplex();

    // c1.deallocateMemory();
    // c2.deallocateMemory();
    return 0;
}