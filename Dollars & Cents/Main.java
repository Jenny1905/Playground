#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,c,d;
  cin>>d1>>c1>>d2>>c2;
   d=d1+d2;
   c=c1+c2;
  while(c>100)
  {
    
    d=d+1;
    c=c-100;
    break;
  }
  cout<<d<<endl<<c;
}
 
  
  
  
