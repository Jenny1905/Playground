#include<stdio.h>
int main()
{
  int n,count=0,data=100,flag=1;
  scanf("%d",&n);
  while(count<n)
  {
    for(int i=2;i<=data-1;i++)
    {
      if(data%i==0)
      {
        flag=0;
        break;
      }
    }
    if(flag)
    {
      printf("%d ",data);
      count++;
    }
    data++;
    flag=1;
  }
  
        
      
  
  
  
}