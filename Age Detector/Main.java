#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(a>b)
  {
  int x=1900+a;
  int y=2000+b;
  cout<<y-x;
  }
  else
  {
    int x=2000+a;
    int y=2000+b;
    cout<<y-x;
  }
  
}