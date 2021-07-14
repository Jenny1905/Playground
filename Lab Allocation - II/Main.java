#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 	int x,y,z;
  cin>>x>>y>>z;
  char lab[20];
  cin>>lab;
  if(strcmp(lab,"L1")==0)
  {
    if(y<z)
    {
      cout<<"L2";
    }
    else
    {
      cout<<"L3";
    }
  }
  else if(strcmp(lab,"L2")==0)
  {
    if(x<z)
    {
      cout<<"L1";
    }
    else
    {
      cout<<"L3";
    }
  }
  else
  {
    if(x<y)
    {
      cout<<"L1";
    }
    else
    {
      cout<<"L2";
    }
  }
  
}