#include<iostream>
using namespace std;
int queue[100],front=-1,rear=-1;
void enqueue(int val)
{
  if(front==-1)
  	front=rear=0;
  queue[rear]=val;
  rear++;
}
void priority()
{
  for(int i=front;i<rear;i++)
  {
    for(int j=front;j<rear-i-1;j++)
    {
      if(queue[j]<queue[j+1])
      {
        int temp=queue[j];
        queue[j]=queue[j+1];
        queue[j+1]=temp;
      }
    }
  }
}
void display()
{
  cout<<"The priority queue elements are:\n";
  for(int i=front;i<rear;i++)
  {
    cout<<queue[i]<<" ";
  }
}
int main()
{
  int n,val;
  cout<<"Enter the number of values to be inserted:\n";
  cin>>n;
  cout<<"Enter the values to be inserted in priority queue:\n";
  for(int i=0;i<n;i++)
  {
    cin>>val;
    enqueue(val);
  }
  priority();
  display();
  return 0;
}
  
          
        
    
  