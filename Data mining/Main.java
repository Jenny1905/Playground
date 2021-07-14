#include<iostream>
using namespace std;
int main()
{
  
  int n,osum=0,esum=0,num;
  cin>>n;
  while(n>0)
  {
    num=n%10;//1
    if(num%2==0)
    {
      esum=esum+num;//4
    }
    else
    {
      osum=osum+num;//4
    }
    n=n/10;//0
  }
  if(esum==osum)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
    
}