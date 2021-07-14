#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int p,n;
  float r;
  cin>>p>>r>>n;
  float si,a,d,fs;
  si=(p*r*n)/100;
  a=p+si;
  d=si*2/100;
  fs=a-d;
  cout<<fixed<<setprecision(2)<<si<<endl;
  cout<<fixed<<setprecision(2)<<a<<endl;
  cout<<fixed<<setprecision(2)<<d<<endl;
  cout<<fixed<<setprecision(2)<<fs<<endl;

}