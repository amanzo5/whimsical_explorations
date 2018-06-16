/*Programming Final*/
public class TrainCar 
{
 //instance variables
 protected int carnum;
 protected String wheelamt;
 protected double speed;
 
 //create a constructor for the TrainCar
 public TrainCar(int carnum, String wheelamt, double speed)
 {
  this.carnum=carnum;
  this.wheelamt=wheelamt;
  this.speed=speed;
 }
 
 //create accessors 
 public int getCarNum() 
 {
  return carnum;
 }
 
 public String getWheelAmt() 
 {
  return wheelamt;
 }
 
 public double getSpeed() 
 {
  return speed;
 }
 
 //mutators 
 public void setCarNum(int carnum)
 {
  this.carnum=carnum;
 }
 
 public void setWheelAmt(String wheelamt)
 {
  this.wheelamt=wheelamt;
 }
 
 public void setSpeed(double speed)
 {
  this.speed=speed;
 }
 
 
 
 
 //create a to String 
 public String toString()
 {
  String toReturn=" "+carnum+" "+wheelamt+" "+speed;
  return toReturn;
 }
 
 
 
}
