/*Lab3:toString,equals,and,static*/
import java.util.*;
public class TrainSystem
{
  private Train trainX;
  private Train trainY;
  
  //create a scanner
  Scanner scan= new Scanner(System.in);


 //create two trains as parameters
 
 public TrainSystem(Train trainX, Train trainY) 
 {
   this.trainX=trainX;
   this.trainY=trainY;
 }
 
 //print out your train method with toString 
      public String toString()   
      {     
      String toReturn = "===============\n";      
      for(int i=0; i<=14; i++)
         { 
          if(i==trainX.GetPosition())
          {
           toReturn+="X";
          }
          else if (i==trainY.GetPosition())
          {
           toReturn+=("Y");
          }
          else
          {
           toReturn+=("-");
          }
         }
      toReturn += "\n===============";
      return toReturn; 
           
        
      }
 
 //create a method called play which asks the player to continue moving trains until they crash
 public void Play()
 {
   boolean crash=false;
   do 
   {
      
      //ask the player to move train X 
      System.out.println("Move the X train left (enter L) or right (enter R)");
      String choicex=scan.next();
      
      //create an if statement do determine to move left or right for train X
      if(choicex.equals("R"))
      {
       int position=trainX.GetPosition();
       trainX.SetPosition(position+1);
      }
      if(choicex.equals("L"))
      {
       int position=trainX.GetPosition();
       trainX.SetPosition(position-1);
      }
      
      
      
     //create if else statement to determine if the positions are the same
      if(trainX.equals(trainY))
       {
        crash=true;
        System.out.println("CRASH!!!");
        System.out.println("Moves before crash:"+trainX.HowMany());
        break;
       } 
      else
      //print out after trainX has been positioned
      System.out.println(this);
      
         
      //ask the player to move train Y 
      System.out.println("Move the Y train left (enter L) or right (enter R)");
      String choicey=scan.next();
      
      //create an if statement do determine to move left or right for train Y
      if(choicey.equals("R"))
      {
       int position=trainY.GetPosition();
       trainY.SetPosition(position+1);
      }
      if(choicey.equals("L"))
      {
       int position=trainY.GetPosition();
       trainY.SetPosition(position-1);
      }
      
      
      
      //create if else statement to determine if the positions are the same
      if(trainX.equals(trainY))
       {
        crash=true;
        System.out.println("CRASH!!!");
        System.out.println("Moves before crash:"+trainX.HowMany());
        break;
       }
       else
       //print out after train Y has been positioned 
       System.out.println(this);
  
      
      
    }
   while(crash==false);
 
  }

}
