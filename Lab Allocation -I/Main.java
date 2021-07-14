#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  if(x<y && x<z)
  {
    cout<<"L1";
  }
  else if(y<z && y<x)
  {
    cout<<"L2";
  }
  else
  {
    cout<<"L3";
  }
  
}