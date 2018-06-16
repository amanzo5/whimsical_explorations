/*Programming Final*/
public class TrainStackedList
{
 //instances 
 private TrainNode head;
 private TrainNode tail;
 private int numberOfItems;
 
 //constructor
 public TrainStackedList()
 {
  tail=null;
  head=null;
  numberOfItems=0;
 }
 
 //accessor for number of Items
 public int getNumberOfItems()
 {
  return numberOfItems;
 }
 
 //push method
 public void push(TrainCar tc)
 {
  TrainNode tn=new TrainNode(tc);
  tn.setNext(head);
  head=tn;
  numberOfItems++;
   
 }
 
 //pop method
 public TrainCar pop() 
 {
  try
  {
   TrainCar deleted= head.getCar();
   head=head.getNext();
   numberOfItems--;
   return deleted;
  } 
  catch(NullPointerException npe) 
  {
   System.out.println("Stack is empty!"); 
   return null;
  }
  
 }
 
 //peek method 
 public TrainCar peek()
 {
  try
  {
   return head.getCar();
  }
  catch(NullPointerException npe)
  {
   System.out.println("Stack is empty!"); 
   return null;
  }
 }
 
 //to add at the end
 public void insertAt(TrainCar tc, int index)
 {
  //make an IntegerNode 
  TrainNode tn= new TrainNode(tc);
  
  //code for traversion 
  TrainNode current=head;
  TrainNode previous=null;
  int i=0;
  
  if(index==-1 || index==0)
  {
   tn.setNext(head);
   head=tn;
   numberOfItems++;
   
  }
  else
  {
   while(current!=null && i<index)
   {
    previous=current;
    current=current.getNext();
    i++;
   }
  
   //set the node between the two nodes
   tn.setNext(current);
   previous.setNext(tn);
   numberOfItems++;
  }
  
   
  
  
 }

 
 
 
 //create a toString
 public String toString()   
 {     
  String toReturn = "";  
  TrainNode current= head;
 
  //create a for loop that will utilize to toString used in Card    
  for(int i=0; i<numberOfItems; i++)
  { 
   
   //add to the string
   toReturn+=current.getCar();
   if(i==numberOfItems)
   {
    toReturn+="";
   }
   else
   {
    toReturn+=":::";
   }
   
   
   //run through the list 
   current=current.getNext();

  }
  //print the bottom
  toReturn += "";
  return toReturn; 
 }

}
