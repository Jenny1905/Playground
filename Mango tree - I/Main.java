#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if((t<c) || (t%c==0) || (t%c==1))
     {
       cout<<"Yes";
     }
     else
     {
       cout<<"No";
     }
  
  
}