#include<iostream>
#include<math.h>
using namespace std;
int binary(int n,int i)
{
  int b,c,d;
  b=n%2;//1
  n=n/2;//0
  c=pow(10,i);//10000
  i++;//4
  d=c*b;//10000
  if(n>0)
  {
    return d+binary(n,i);//0+bin(1,4)
  }
  else
  {
    return d;
  }
}
int main()
{
  int n,i=0;
  cin>>n;
  int b=binary(n,i);//5 2
  cout<<b;
  return 0;
}
