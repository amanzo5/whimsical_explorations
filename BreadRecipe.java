/*Written By Ashley Manzo*/
import java.util.*;
public class BreadRecipe extends Recipe
{

 //make instances 
 private String theRecipe="";
 
 //make a constructor
 public BreadRecipe()
 {
  
 }
 
 //override the addInstruction method
 public void addInstruction(String instruction)
 {
   theRecipe+=instruction;
   theRecipe+="\n";
 }
 
 //override the addIngredient method
 public void addIngredient(String ingredient)
 {
   theRecipe+=ingredient+" - ";
 }
 
 //print out theRecipe with toString 
 public String toString()   
 {     
   String toReturn = theRecipe;      
   return toReturn; 
 }

}