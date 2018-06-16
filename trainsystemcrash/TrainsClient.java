/*Lab3:toString,equals,and,static*/
public class TrainsClient
{
   public static void main(String[]args)
   {
    //create our trains 
    Train tx=new Train(1);
    Train ty=new Train(13);
    
    //create our train system
    TrainSystem crashers = new TrainSystem(tx,ty);
    
    //play the game 
    crashers.Play();
   }
}
