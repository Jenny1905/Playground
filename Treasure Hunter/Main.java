#include<iostream>
using namespace std;
int main()
{
  int g,bp,bbp;
  cin>>g>>bp>>bbp;
  int l,bb,p;
  l=g*bp/100;
  g=g-l;
  bb=g*bbp/100;
  g=g-bb;
  p=g/3;
  cout<<l<<endl<<bb<<endl<<p;
  
}