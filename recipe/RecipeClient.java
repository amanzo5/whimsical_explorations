/*Written By Ashley Manzo*/
import java.util.*;
public class RecipeClient
{
 public static void main(String[]args) 
 {
   //create a scanner
   Scanner scan=new Scanner(System.in);
   
   //create an ArrayList of Recipes
   ArrayList<Recipe> Recipes= new ArrayList<Recipe>();
   
   //Create a new ice cream Recipe
   IcecreamRecipe vanilla= new IcecreamRecipe();
   
   //add ingredients
   vanilla.addIngredient("2 cups heavy cream");
   vanilla.addIngredient("1 cup whole milk");
   vanilla.addIngredient("3/4 cup sugar");
   vanilla.addIngredient("1/16 tsp salt");
   vanilla.addIngredient("2 tbsp vanilla extract");
   
   //add instructions 
   vanilla.addInstruction("put in a large bowl");
   vanilla.addInstruction("add to the bowl with the heavy cream");
   vanilla.addInstruction("add and stir together with a whisk");
   vanilla.addInstruction("add and stir together with a whisk");
   vanilla.addInstruction("add and stir together with a whisk");
   vanilla.addInstruction("place in fridge for 2 hours\nNext, place mixture in ice cream maker for 20 minutes. Take out an scoop into a freezable container. Put ice cream in fridge");
   
   //add vanilla to the ice cream arraylist 
   Recipes.add(vanilla);
   
   //create a breadRecipe
   BreadRecipe basicbread= new BreadRecipe();
   
   //add ingredients and instructions
   basicbread.addIngredient("3.2 cups lukewarm water");
   basicbread.addInstruction("put into a 4qrt (or larger) bowl");
   
   basicbread.addIngredient("1 tsp salt");
   basicbread.addInstruction("mix with water");
   
   basicbread.addIngredient("1 tbsp yeast");
   basicbread.addInstruction("mix with water");
   
   basicbread.addIngredient("6 1/2 cups of unbleached flour");
   basicbread.addInstruction("mix with water, using wooden or plastic spoon.\nput bowl in fridge and, after cool, take it out and divide dough into 10 equal parts\nform dough into balls and let rise for 2 hours\nNext put in oven@350 degrees for 25 minutes.");
   
   //add to recipe array
   Recipes.add(basicbread);
   
   //create a new Icecream Recipe
   IcecreamRecipe chocochip= new IcecreamRecipe();
   
   //add the previous recipe
   chocochip.addIceCream(vanilla);
   
   //add ingredients
   chocochip.addIngredient("-");
   chocochip.addIngredient("1 cup tiny chocolate chips");
   
   //add instructions
   chocochip.addInstruction("OPTIONAL: when 2 minutes are left for churning, add the tiny chocolate chips into the machine");
   
   //add chocochip to the ice cream arraylist 
   Recipes.add(chocochip);
   
   //make ANOTHER IcecreamRecipe
   IcecreamRecipe custom= new IcecreamRecipe();
   
   //add the previous recipe
   custom.addIceCream(vanilla);
   
   //add ingredients
   custom.addIngredient("-");
   custom.addIngredient("Add whatever toppings you want! :D");
   
   //add chocochip to the ice cream arraylist 
   Recipes.add(custom);
   
   //create a for loop 
   for(int i=0; i<Recipes.size(); i++)
   {
      System.out.println(Recipes.get(i));
      
   }
   
   
   
   
   
   
   
 }
}
