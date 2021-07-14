#include<iostream>
using namespace std;
int main()
{
 int n,num,rem=0,sum=0;
  cin>>num;
  n=num;//1729
  while(num>0)//
  {
    rem=num%10;//1
    sum=sum+rem;//19
    num=num/10;//0
  }
  if(n%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
  
}