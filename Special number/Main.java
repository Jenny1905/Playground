#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,i;
  cin>>a>>b;
  for(i=a;i<=b;i++)
  {
    c=i/10;
    d=i%10;
    e=c+d;
    f=c*d;
    if((e+f)==i)
    {
      cout<<i<<endl;
    }
  }
}