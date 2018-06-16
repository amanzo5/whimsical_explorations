/*Programming Final*/
public class PassengerCar extends TrainCar
{
 //instance variables 
 private int passengers;
 //private int carnum;
 //private String wheelamt;
 //private double speed;
 
 //create a constructor
 public PassengerCar(int carnum, String wheelamt, double speed, int passengers)
 {
  //inherit 
  super(carnum,wheelamt,speed);
  this.passengers=passengers; 
 }
 
 //create accessor and mutator for passengers
 public int getPassengers()
 {
  return passengers;
 }

 public void setPassengers(int passengers)
 {
  this.passengers=passengers;
 }
 
 //create a toString
 public String toString()
 {
  String toReturn="<["+carnum+" "+wheelamt+" "+speed+" "+passengers+"]>";
  return toReturn;
 }
}