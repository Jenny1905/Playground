#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fsc,sa,sd,ssc,aa,ad,asc;
  cin>>fa>>fd>>fsc>>sa>>sd>>ssc>>aa>>ad>>asc;
  int f=fa-(fa*fd/100)+fsc;
  int s=sa-(sa*sd/100)+ssc;
  int a=aa-(aa*ad/100)+asc;
  cout<<"In Flipkart Rs."<<f<<endl;
  cout<<"In Snapdeal Rs."<<s<<endl;
  cout<<"In Amazon Rs."<<a<<endl;
  if(f<=s && f<=a) 
  {
    cout<<"He will prefer Flipkart";
  }
  else if(s<=f && s<=a)
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }


  
}