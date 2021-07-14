#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[30];
  cin>>str;
  int r;
  cin>>r;
  if(strcmp(str,"rear")==0)
  {
    if(r==1)
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
  else if(strcmp(str,"front")==0)
  {
    if(r==1)
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
  else if(strcmp(str,"REAR")==0)
  {
    if(r==1)
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
  else
  {
    if(r==1)
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
    
      
  
}