#include<iostream>
using namespace std;
int main()
{
  int unit,bill;
  cin>>unit;
  if(unit<=200)
  {
    bill=unit*0.5;
  }
  else if(unit<=400)
  {
    bill=(unit*0.65)+100;
  }
  else if(unit<=600)
  {
    bill=(unit*0.80)+200;
  }
  else
  {
    bill=(unit*1.25)+425;
  }
  cout<<"Rs."<<bill;
  
}