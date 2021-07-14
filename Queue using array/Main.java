#include<iostream>
using namespace std;
int front=0,rear=0;
int main()
{
  int n;
  cin>>n;
  int queue[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Insert the element in queue :"<<endl;
    cin>>queue[rear++];
  }
  if(rear==0)
  {
    cout<<"Queue is empty";
  }
  else
  {
    cout<<"Queue elements are :"<<endl;
    for(int i=front;i<rear;i++)
    {
      cout<<queue[i]<<" ";
    }
  }
  return 0;
}
    
    