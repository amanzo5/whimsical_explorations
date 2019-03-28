/*Number.h*/
#include "Token.h"

#ifndef Number_h
#define Number_h

class Number: public Token
{
private:
    //the number value being held
    int value;
public:
    //a constructor that turns a char and turns it into an int
    Number();
    
    Number(char choice);
    
    //an implementation of the toString function
    string toString();
    
    //functions to get and set the value
    int getValue();
    void setValue(int value_in);
};
#endif /* Number_h */
