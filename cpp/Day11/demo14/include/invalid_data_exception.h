#ifndef INVALID_DATA_EXCEPTION_H
#define INVALID_DATA_EXCEPTION_H
#include <iostream>
using namespace std;

// to divide this file into .cpp file

class InvalidDataException
{
private:
    string msg;

public:
    InvalidDataException()
    {
        this->msg = "Something went wrong...";
    }

    InvalidDataException(string msg)
    {
        this->msg = msg;
    }

    void displayError()
    {
        cout << "msg" << endl;
    }
};

#endif