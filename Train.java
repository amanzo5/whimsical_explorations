/*Lab3:toString,equals,and,static*/
public class Train
{
 //instance variables
 private int position;
 public static int count;
 
 //create a method to initialize position 
 public Train()
 {
   position=0;
 }

//return count
public static int HowMany()
{
  return count;
}
 //get method
 public int GetPosition()
 {
  return position;
 }
 
 public void SetPosition(int position_in) 
 {
   position=position_in;
  
  //create an if statement to put boundaries on the position variable  (int)
  if(position > 14 || position < 0)
   
   {
      if(position>14)
      {
         
        position=0;
         
      }
  
      if(position<0)
      {
       
       position=14;
         
      }
   }
    
  //increase count
  count++;

 }
 
 //create a method that set the position 
 public Train(int position_in)
 {
  position=position_in;
  
  //create an if statement to put boundaries on the position variable  (int)
  if(position > 14 || position < 0)
   
   {
      if(position>14)
      {
         
        position=0;
         
      }
  
      if(position<0)
      {
       
       position=14;
         
      }
   }
   
  

  }
  
  //create an equals method
  public boolean equals(Object o)    
   {
      if(! (o instanceof Train))      
      { 
         return false;      
      }
      else   
      {   
             
      Train otherTrain = (Train) o;
      
      if(otherTrain.position==position)
      {
         return true;
      }
      else
         return false;
      }
    }
  
}