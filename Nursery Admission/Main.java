#include<iostream>
using namespace std;
int main()
{
  char str[20];
  cin>>str;
  int i;
  for(i=0;str[i]!='\0';i++);
  {
    cout<<"The number of letters in the name is " <<i;


  }
}