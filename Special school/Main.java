#include<iostream>
#include<string.h>
using namespace std;
int special(char *str)
{
  int i=0,j=0;
  while(str[j+1])j++;
    while(i<j)
    {
      char temp=str[i];
      str[i]=str[j];
      str[j]=temp;
      i++;
      j--;
      
    }
}
int main()
{
  char str1[50],str2[50];
  cin>>str1;
  cin>>str2;
  special(str1);//fun call
  if(strcmp(str1,str2)==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
    
}
  
      
