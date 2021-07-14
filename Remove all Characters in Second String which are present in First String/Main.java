#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50], s2[50], r[50];
  cin>>s1>>s2;
  int k;
  
  for(int i=0; s1[i]!='\0'; i++)
  {
    for(int j=0;s2[j]!='\0';j++)
    {
      
    if(s1[i] == s2[j])
    {
      continue;
    }
      else
      {
        r[k]=s2[j];
        k++;
      }
    }
    r[k]='\0';
    strcpy(s2,r);
    k=0;
  }
  cout<<r;
}
    
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
        