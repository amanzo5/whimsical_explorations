/*Programming Final*/
public class TrainNode
{
 //instances 
 private TrainCar tc;
 private  TrainNode next;
 
 //default constructor
 public TrainNode()
 {
  tc=null;
  next=null;
 }
 
 //an overloaded constructor to put new data
 public TrainNode(TrainCar newCar)
 {
  //setCard(newCard);
  tc=newCar;
  next=null;
 }
 
 //accessor for the data
 public TrainCar getCar()
 {
  return tc;
 }
 
 //accessor for the next
 public TrainNode getNext()
 {
  return next;
 }
 
 //mutator for the data 
 public void setCar(TrainCar newCar)
 {
  tc=newCar;
 }
 
 //mutator for the next
 public void setNext(TrainNode cd)
 {
  next=cd; 
 }
 
 
}
 
 
