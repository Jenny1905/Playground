#include<iostream>
using namespace std;
int main()
{
  int n,i,arr[30],x=1,y=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cout<<x;
  for(i=1;i<n;i++)
  {
  if(arr[i]<arr[i-1])
    cout<<"\n"<<x;
  else
  {
    y=y+2;//2
    cout<<"\n"<<y;
  }
  }
}