#include<iostream>
using namespace std;
int main()
{
  int n,arr[30];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;)
    {
      if(arr[i]==arr[j])
      {
        for(int k=j;k<n-1;k++)
        {
          arr[k]=arr[k+1];
        }
          n--;
      } 
      else
      {
        j++;
      }
    }
  }   
  for(int i=0;i<n;i++)
  {
    cout<<arr[i]<<"\n";
  }
  return 0;
}