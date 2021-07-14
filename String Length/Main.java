#include<iostream>
using namespace std;
int main()
{
  char str[20];
  cin>>str;
  int i;
  for(i=0;str[i]!='\0';i++);
  {
    cout<<"The length of word "<< str << " is " <<i;
  }
}


        
