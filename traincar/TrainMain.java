/*Programming Final*/
import java.util.*;
import java.io.*;
public class TrainMain
{
 public static void main(String[]args)
 {
  //create 5 different traincars
  TrainCar t1=new TrainCar(121,"4-8-0",5);
  TrainCar t2=new TrainCar(122,"4-8-0",6);
  TrainCar t3=new TrainCar(123,"4-8-0",7);
  TrainCar t4=new TrainCar(124,"4-8-0",8);
  TrainCar t5=new TrainCar(125,"4-8-0",9);
  
  //print out the traincars
  System.out.println(t1);
  System.out.println(t2);
  System.out.println(t3);
  System.out.println(t4);
  System.out.println(t5);
  
  //create a scanner
  Scanner scan=new Scanner(System.in);
  
  //ask the user for the distance 
  System.out.println("What is the distance?");
  int distchoice=scan.nextInt();
  
  //ask the user for the choice of car
  System.out.println("What is the car number?"); 
  int carchoice=scan.nextInt();
  
  //create conditions 
  if(t1.getCarNum()==carchoice)
  {
   System.out.println("Time to travel is: "+(double)distchoice/t1.getSpeed());
  }
  
  else if(t2.getCarNum()==carchoice)
  {
   System.out.println("Time to travel is: "+(double)distchoice/t2.getSpeed());
  }
  
  else if(t3.getCarNum()==carchoice)
  {
   System.out.println("Time to travel is: "+(double)distchoice/t3.getSpeed());
  }
  
  else if(t4.getCarNum()==carchoice)
  {
   System.out.println("Time to travel is: "+(double)distchoice/t4.getSpeed());
  }
  
  else if(t5.getCarNum()==carchoice)
  {
   System.out.println("Time to travel is: "+(double)distchoice/t5.getSpeed());
  }
  
  //create 3 engines and then 2 passenger cars and print them out on the screen 
  
  Engine e1=new Engine(131,"4-8-0",5,104.1);
  Engine e2=new Engine(132,"4-8-0",5,100.1);
  Engine e3=new Engine(133,"4-8-0",5,101.1);
 
  PassengerCar p1=new PassengerCar(134,"2-2",5,42);
  PassengerCar p2=new PassengerCar(135,"2-2",5,39);
  
  System.out.println("Engines:");
  System.out.println(e1);
  System.out.println(e2);
  System.out.println(e3);
  
  System.out.println("PassengerCars:");
  System.out.println(p1);
  System.out.println(p2);
  
  //its Train making time!
  
  //create a linked list
  TrainStackedList tsl=new TrainStackedList();
  
  //say its time to start
  System.out.println("Train Making Time!");
  String trainchoice="";
  boolean keepgoing=true;
  int count=100;
  
  while(keepgoing)
  {
   //ask what they want
   System.out.println("");
   System.out.println("What car would you like to add? (E for engine, P for passenger car, Q for quit)");
   //scan their choice
   if(scan.hasNext())
   {
      trainchoice = scan.next();
   }
   
   // create if statements to do certain action based on the input
   if(trainchoice.equalsIgnoreCase("E"))
   {
    //create an engine 
    Engine e4= new Engine(count,"4-4-2",5,100);
    count++;
    
    //ask whether the front or the back
    System.out.println("Front or Back?");
    String location=scan.next();
    //condition
    if(location.equalsIgnoreCase("F"))
    {
    tsl.push(e4);
    }
    if(location.equalsIgnoreCase("B"))
    {
    tsl.insertAt(e4,tsl.getNumberOfItems());
    }
   }
   
   if(trainchoice.equalsIgnoreCase("P"))
   {
    //create an PassengerCar
    PassengerCar p3= new PassengerCar(count,"2-2",5,100);
    count++;
    
    //ask whether the front or the back
    System.out.println("Front or Back?");
    String location=scan.next();
    //condition
    if(location.equalsIgnoreCase("F"))
    {
    tsl.push(p3);
    }
    if(location.equalsIgnoreCase("B"))
    {
    tsl.insertAt(p3,tsl.getNumberOfItems());
    }

    
   }
   
   if(trainchoice.equalsIgnoreCase("Q"))
   {
    //make keepgoing equal to false
     keepgoing=false;
     System.out.println("Thank you! Have a nice day!☺ ☺ ☺");   
   }
  }
  
  //then print out the list
  //for(int i=0; i<tsl.getNumberOfItems();i++)
  //{
   //tsl.peek().setCarNum(i+100);
  //} 
  
  System.out.println("Train:");
  System.out.println(tsl);
  
  
  //ask the user what file they wish to output the train to 
  System.out.println("What file would you like to save your train to?");
  String filechoice=scan.next();
  
  //create a try/catch 
  try 
  {
   FileOutputStream fos=new FileOutputStream(filechoice,false);
   PrintWriter pw=new PrintWriter(fos);
   //print the linked list
   pw.print(tsl);
   //close the file 
   pw.close();
  }
  catch(FileNotFoundException fnfe)
  {
   System.out.println("Unable to find "+filechoice);
  }
 }
} 
