#include<iostream>
using namespace std;
int main()
{
  int wl,wb,l1,b1,l2,b2;
  cin>>wl>>wb>>l1>>b1>>l2>>b2;
  int w=wl*wb;
  int p1=l1*b1;
  int p2=l2*b2;
  int p=p1+p2;
  if(p<=w)
  {
    cout<<"Leonardo can fix both painting";
  }
  else
  {
    cout<<"Leonardo cannot fix both painting";
  }
    
  
  
}