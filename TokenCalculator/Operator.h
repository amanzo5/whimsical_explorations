/*Operator.h*/
#include "Token.h"
#include "Number.h"
#ifndef Operator_h
#define Operator_h

class Operator: public Token
{
public:
    //default constructor
    Operator();
    
    //an abstract function called operate
    virtual Number operate(Number num1, Number num2);
    
};
#endif /* Operator_h */
