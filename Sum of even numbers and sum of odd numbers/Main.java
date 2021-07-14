#include <iostream>
using namespace std;
int main() 
{
   int n,arr[30],esum=0,osum=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
      esum=esum+arr[i];//16
    }
    else
    {
      osum=osum+arr[i];//2
    }
  }
    cout<<"The sum of the even numbers in the array is "<<esum<<"\n";
    cout<<"The sum of the odd numbers in the array is "<<osum;
    
    return 0;
}