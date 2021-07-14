#include<iostream>
using namespace std;
int main()
{
  int row,col,a[10][10],b[10][10],c[10][10];
  cin>>row>>col;
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      cin>>b[i][j];
    }
  }
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      c[i][j]=a[i][j]+b[i][j];
    }
  }
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      cout<<c[i][j]<<" ";
    }
    cout<<"\n";
  }
  
  
}