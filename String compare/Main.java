#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[20],str2[20];
  cin>>str1>>str2;
  if(strcmp(str1,str2)==0)
  {
    cout<<"Strings are same";
  }
  else
  {
    cout<<"Strings are not same";
  }
  
}