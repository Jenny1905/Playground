#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,c=0;
  cin>>n;//3
  for(int i=3;i<=n;i++)
  {
    c=a+b;//1
    a=b;
    b=c;
    
  }
  cout<<c;
  
    
  
  
  
}