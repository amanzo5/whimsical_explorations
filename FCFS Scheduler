#include <iostream>
using namespace std;

//pass the arrays seperately 
void FCFS(int at[], int bt[], int pro, int thru)
{
  //print out the name of the scheduler 
  cout << "FCFS CPU Scheduler" << endl;
  
  //create an array to keep track waitimes 
  int wt[10];
  float totalWait=0;
  float avgWait=0;
  //create an array to keep track of turnaround times
  int tat[10];
  float totalTat=0;
  float avgTat=0;
  //create an int that keeps track of total time
  int total=0;
  //create a count for process tracker
  int count=0;

  /*----------------CODE TO CALCULATE AVG TURNAROUND TIME---------------------*/
 
  //make the waiting time for the first round equal to zero
  tat[0]=0;
  //have a loop that traverses the array and calculates wait times
  for(int i=0; i<pro; i++)
    {
      //say that total is total plus the burst time
      total+=bt[i];
      
      //once we have the total time, subtract the total time from the arrival
      //time to get the turnaround time
      tat[i]=total-at[i];

      //if the arrival time in the next process is larger that the total time    
      //add the difference to the total to compensate for the gap                   
      if(at[i+1]>total)
	{
	  total+=at[i+1]-total;                                                    
        }
    }

 //add the times together and divide by the number of processes 
 for(int i=0; i<pro; i++)
   {
     totalTat+=tat[i];
   }
  
 //calculate avg
 avgTat=totalTat/pro;

 //print out the average waiting time
 cout << "The average turnaround time is: " << avgTat << endl;


  /*---------------CODE TO CALCULATE AVERAGE WAITING TIME----------------*/

 //create a loop that will subtract burst time from turnaround time then get 
 for(int i=0; i<pro; i++) 
 {
   wt[i]=tat[i]-bt[i];
  totalWait+=wt[i];
 }

 //print out average wait time
 avgWait=totalWait/pro; 
 cout<<"Average wait time: "<<avgWait << endl;

  /*---------------CODE TO CALCULATE THROUGHPUT FOR GIVEN PERIOD------------*/

 //loop so when thru 
 for(int i=0; i<pro; i++)
   {
     if(thru>=at[i] && thru>=at[i]+tat[i])
       {
	 count++;
       }
   }

//print out how many processes have happened
cout<< "Throughput of " << count << " processes in " << thru << " seconds " << endl;

 cout<<endl;
  //print out the number of processes 
  cout << "The number of processes is: " << pro << endl;
 
  //print out the values that have been inputted by the user
  for (int i=0; i<pro; i++)
    {
      cout << "P" << i+1 << " arrival: "<< at[i] << endl;
      cout << "P" << i+1 << " burst: " << bt[i] << endl;
    }
   
  //output the number of seconds being tested 
  cout << "Throughput used in testing: " << thru << endl;
}

