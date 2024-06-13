#ifndef RECTANGLE_H
#define RECTANGLE_H
#include "./shape.h"
class Rectangle : public Shape
{
private:
    int length;
    int breadth;

public:
    void acceptData();
    void calculateArea();
};

#endif