#include <iostream>
using namespace std;

class Singleton
{
private:
    static Singleton *ptr;
    Singleton()
    {
        cout << "Inside Ctor" << endl;
    }

public:
    static Singleton *getInstance()
    {
        if (ptr != NULL)
            return ptr;
        ptr = new Singleton;
        return ptr;
    }
};
Singleton *Singleton::ptr = NULL;
int main()
{
    Singleton *s1 = Singleton::getInstance();
    Singleton *s2 = Singleton::getInstance();
    Singleton *s3 = Singleton::getInstance();
    return 0;
}