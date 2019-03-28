#include <iostream>
#include <string>
#include "printmenu.h"
using namespace std;

//create a menu! 
string printMenu()
{
    string menu="Menu:\n";
    menu+="s: set a value\n";
    menu+="p: print a value\n";
    menu+="d: delete a value\n";
    menu+="i: create a new int\n";
    menu+="w: add two values\n";
    menu+="q: quit\n";
    
    return menu;
    
}
