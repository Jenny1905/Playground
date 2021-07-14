#include<iostream>
using namespace std;
int main()
{
  int a,l;
  cin>>a>>l;
  int v=(a*a*a)*1000;
  if(v<l)
  {
    cout<<"Cannot store";
  }
  else
  {
    cout<<"Can store";
  }
  
}