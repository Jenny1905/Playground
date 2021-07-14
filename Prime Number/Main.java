#include<iostream>
using namespace std;
int prime(int,int);
int main()
{
  int n;
  int f;
  cin>>n;
  
  f=prime(n,n/2);
  if(f==0)
  {
    cout<<"Not a Prime Number";
  }
  else 
  {
    cout<<"Prime Number";
  }
}
int prime(int n,int q)
{
  
  if(q==1)
  {
    return 1;
  }
  else 
  {
    if(n%q==0)
    {
      return 0;
    }
    else
    {
   		 return prime(n,q-1);
    }
  }
}

      