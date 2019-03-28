/*Token.h file*/
#include <string>
using namespace std;

#ifndef Token_h
#define Token_h

//create class
class Token
{
public:
    //constructor
    Token();
    //abstract function that returns string 
    virtual string toString();
};

#endif /* Token_h */
