/*Written By Ashley Manzo*/
import java.util.*;
public class IcecreamRecipe extends Recipe
{
   
  
   
   //create an array list for instructions 
   private ArrayList<String> Instructions= new ArrayList<String>();
   //create an array list for ingredients
   private ArrayList<String> Ingredients= new ArrayList<String>();
   
   public IcecreamRecipe()
   {
   }
   
   //implement the addInstruction method
   public void addInstruction(String instruction)
   { 

      Instructions.add(instruction);
     
   }
   
   //implement the addIngredient method
   public void addIngredient(String ingredient)
   {
     Ingredients.add(ingredient);
   }
   
   //Create a toString printing out each of the ith instructions 
   //create a for loop 
      public String toString()   
      {     
      String toReturn = "\n";  
      
      //account for if the ingredients array is bigger than the instructions array
      if(Instructions.size()>Ingredients.size())
      {
       for(int i=0; i<Ingredients.size(); i++)
       {
        toReturn+=("Ingredient: "+Ingredients.get(i)+" - "+Instructions.get(i)+"\n"); 
        toReturn+="";
       }
       for(int i=Ingredients.size(); i<Instructions.size(); i++)
       {
        toReturn+=(" - "+Instructions.get(i)+"\n");
        
        
       }
       
      } 
      
      
      //account for if the instructions array is bigger than the ingredients array 
      if(Ingredients.size()>Instructions.size())
      {
       for(int i=0; i<Instructions.size(); i++)
       {
        toReturn+=("Ingredient: "+Ingredients.get(i)+" - "+Instructions.get(i)+"\n"); 
        toReturn+="";
       }
       for(int i=Instructions.size(); i<Ingredients.size(); i++)
       {
        toReturn+=("Ingredient: "+Ingredients.get(i)+"\n");
       }

      } 
      
      //account for if the instructions array is the same size as the ingredients array 
      if(Ingredients.size()==Instructions.size())
      {
       for(int i=0; i<Instructions.size(); i++)
       {
        toReturn+=("Ingredient: "+Ingredients.get(i)+" - "+Instructions.get(i)+"\n"); 
        toReturn+="";
       }
      }     
      toReturn += "\n";
      return toReturn; 
      }
      
     //Create a method called add which takes in an IceCream Recipie as input and copies all its instructions from the input IceCreamRecipe and ingredients into this
     public void addIceCream(IcecreamRecipe recipe2)
     {
      for(int i=0; i<recipe2.Instructions.size(); i++)
      {
      
         this.Instructions.add(recipe2.Instructions.get(i));
         
      }
      for(int i=0; i<recipe2.Ingredients.size(); i++)
      {
         this.Ingredients.add(recipe2.Ingredients.get(i));
      }
     }      

}
