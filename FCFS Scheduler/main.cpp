#include <iostream>
using namespace std;
#include <iostream>
using namespace std;

int main()
{

  int numprocesses;
  int throughput;
  int arrive[10];
  int burst[10];
  int priority[10];
  int waitime[10];

  double FCFS(int at[],int bt[], int pro, int thru);
  double Priority2(int at[],int bt[],int pri[],int pro,int thru);

  //number of processes to be considered                                                                                                                                                                    
  cout << "Number of processes to be considered" << endl;
  cin >> numprocesses;

  //the throughput time used in time                                                                                                                                                                        
  cout << "Throughput units used in testing" << endl;
  cin >> throughput;

  //ask for arrival, burst and priority                                                                                                                                                                     
  for (int i=0; i<numprocesses; i++)
    {
      cout << "Arrival time:" << endl;
      cin >> arrive[i];
      cout << "Burst time:" << endl;
      cin >> burst[i];
      cout << "Priority:" << endl;
      cin >> priority[i];
    }

  FCFS(arrive,burst,numprocesses,throughput);
  

}
