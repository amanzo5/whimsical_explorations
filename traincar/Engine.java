/*Programming Final*/
public class Engine extends TrainCar
{
 //instance variables 
 private double velocity;
 //private int carnum;
 //private String wheelamt;
 //private double speed;
 
 //create a constructor
 public Engine(int carnum, String wheelamt, double speed, double velocity)
 {
  //inherit 
  super(carnum,wheelamt,speed);
  this.velocity=velocity; 
 }
 
 //create methods for the velocuty  
 public double getVelocity()
 {
  return velocity;
 }
 
 public void setVelocity(double velocity)
 {
  this.velocity=velocity;
 }
 
 //create a toString
 public String toString()
 {
  String toReturn="<O$====["+carnum+" "+wheelamt+" "+speed+" "+velocity+"]>";
  return toReturn;
 }
}
