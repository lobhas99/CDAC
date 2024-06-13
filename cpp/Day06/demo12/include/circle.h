#ifndef CIRCLE_H
#define CIRCLE_H
#include "./shape.h"
class Circle : public Shape
{
private:
    int radius;

public:
    void acceptData();
    void calculateArea();
};

#endif