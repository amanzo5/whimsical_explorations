/*Number.cpp*/

#include "Number.h"

//def
Number::Number()
{
    //default constructor
}

//overloaded
Number::Number(char choice)
{
    //typecast
    value=(int)choice;
}

//toString function
string Number::toString()
{
    string num="";
    num+=value;
    
    //return num
    return num;
}

//accessor
int Number::getValue()
{
    return value;
}

//mutator
void Number::setValue(int value_in)
{
    value=value_in;
}




