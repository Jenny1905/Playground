#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c], t[r][c];
  for(int i=0; i<r; i++)
    for(int j=0; j<c; j++)
      cin>>a[i][j];
  //transpose
  if(r!=c)
  {
    cout<<"Not Symmetric";
  }
  else
  {
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        t[i][j]=a[j][i];
      }
    }
  //check
  int flag=0;
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      if(a[i][j] != t[i][j])
      {
        
         flag = 1;
         break;
      }
    }
  }  
     
if(flag==0)
    cout<<"Symmetric";
  else
    cout<<"Not Symmetric";
  return 0;
}
}