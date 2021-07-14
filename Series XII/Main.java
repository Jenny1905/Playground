#include<iostream>
using namespace std;
int main()
{
  int a=9,b=11,n,c;
  cin>>n;
  if(n==1)
  {
    cout<<a<<" ";
  }
  else if(n==2)
  {
    cout<<b;
  }
  if(n>=3)
  {
    cout<<a<<" "<<b<<" ";
  
  for(int i=3;i<=n;i++)
  {
    c=a+b;
    cout<<c<<" ";
    a=b;
    b=c;
  }
  }
}
    
    
  
    
      
   
      
      
      
      
      
  
 
