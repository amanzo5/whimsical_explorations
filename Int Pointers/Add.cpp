#include <iostream>
#include "Add.h"

void add(int* &index1, int* &index2)
{
    //retrieve data
    int num1;
    int num2;
    num1=*index1;
    num2=*index2;
    
    //create sum
    int sum;
    sum=num1+num2;
    
    //set both values to be the added value
    *index1=sum;
    *index2=sum;
}
