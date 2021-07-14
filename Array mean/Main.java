#include<iostream>
using namespace std;
int main()
{
  int n,arr[30],sum=0,mean;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array "<<"\n";
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    sum=sum+arr[i];//15
  }
  mean=sum/n;
  cout<<"The mean of the array is "<<mean;
  
  
}