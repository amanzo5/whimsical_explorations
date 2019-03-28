/*Pointer Lab Created By Ashley Manzo*/
#include <iostream>
#include <vector>
#include <cmath>
#include "printmenu.h"
#include "Add.h"
using namespace std;

int main()
{
//make a char for choice
char choice=' ';
//make ints
int indexchoice;
int value;
int index1;
int index2;
//make a vector with 26 char pointers in it
vector<char*> pointerOfChars;
pointerOfChars.resize(26);
    
//for loop that makes new charpointers
for (int i=0; i<26; i++)
 {
     //increase charpointer
     pointerOfChars.at(i)=new char('a'+ i);
     //print out whats at i
     cout << pointerOfChars.at(i);
     cout << "\n";
     //delete each char *
     delete pointerOfChars.at(i);
 }
    
//create a new line in between part two and part three
    
//create an array of size 15, using dynamic allocation
int *intarr = new int[15];
//go through a for loop that will print out stuff
for(int i=0; i<15; i++)
{
    intarr[i]=i*i*i*i;
}

//print out the array
for(int i = 0; i < 15; i++)
{
    cout << "i: ";
    cout << intarr[i];
    cout << " ";

}

//create a vector of ten int pointers, instantiate each one of them
vector<int*> pointerOfInts;
pointerOfInts.resize(10);

//loop through the vector and instantiate each one of them
for(int i=0; i<10; i++)
{
    pointerOfInts.at(i)=new int;
}


//new line
cout<< "\n";
cout<< "\n";

while (choice!='q')
{
//printmenu
cout << printMenu();


//take in an choice
cin >> choice;
    
//case for choice being s
if(choice=='s')
{
    //print
    cout << ": ->> ";
    cin >> indexchoice;
    cout << ": ->> ";
    cin >> value;
    
    if(indexchoice<0 || indexchoice>=pointerOfInts.size())
    {
        cout << "Index is out of range!\n";
    }
    
    //assign
    else
    {
    *(pointerOfInts.at(indexchoice))=value;
    }
    
    
}
//case for choice being p
if(choice=='p')
{
    cout << ": ->> ";
    cin >> indexchoice;
    cout << *(pointerOfInts.at(indexchoice))<<"\n";
}
//case for choice being d
if(choice=='d')
{
    cout << ": ->> ";
    cin >> indexchoice;
    
    //print out if its null
    if(pointerOfInts.at(indexchoice)==NULL)
    {
        cout << "Index "<<indexchoice<<" is null!\n";
    }
    else
    {
        //delete at the index
        delete pointerOfInts.at(indexchoice);
        pointerOfInts.at(indexchoice)=NULL;
    }
}
//case for choice being i
if(choice=='i')
{
    cout << ": ->> ";
    cin >> indexchoice;
    
    //if the memory is already being used
    if(pointerOfInts.at(indexchoice)!=NULL)
    {
        cout << "index "<<indexchoice<<" is active\n ";
    }
    
}

//case for choice being w
if(choice=='w')
{
    cout << ": ->> ";
    cin >> index1;
    cout << ": ->> ";
    cin >> index2;
    //do add method with inputs
    add(pointerOfInts.at(index1), pointerOfInts.at(index2));
    
    
}

}
    
//delete memory
for (int i=0; i<pointerOfInts.size(); i++)
{
  //do nothing
  if(pointerOfInts.at(i)==NULL)
  {

  }
  //delete stuff otherwise
  else
  {
      delete pointerOfChars.at(i);
  }
 
}

}



