#include<iostream>
using namespace std;
int main()
{
  int w,na,nc;
  cin>>w>>na>>nc;
  int a=75*na;
  int c=30*nc;
  int h=a+c;
  if(h<=w)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will sink";
  }
  
  
}