#include<iostream>
using namespace std;
int main()
{
  int r,h,amt,hr;
  cin>>r>>h>>amt>>hr;
  int volume=3.142*r*r*h;
  if(volume<=amt*hr)
  {
    cout<<"The tank can be filled within "<<hr<<" hours";
  }
  else
  {
    cout<<"The tank cannot be filled within "<<hr<<" hours";
  }


    
}