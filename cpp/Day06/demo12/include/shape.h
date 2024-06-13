#ifndef SHAPE_H
#define SHAPE_H
#include <iostream>
using namespace std;
class Shape
{
public:
    virtual void acceptData() = 0;
    virtual void calculateArea() = 0;
};
#endif