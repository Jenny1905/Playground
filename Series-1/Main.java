#include<stdio.h>
int main()
{
  int n,a=7,b=5;
  scanf("%d",&n);
  if(n>0)
  {
    if(n==1)
      printf("%d ",a);
    else if(n==2)
      printf("%d %d ",a,b);
    else
    {
      printf("%d %d ",a,b);
      for(int i=3;i<=n;i++)
      {
        if(i%2!=0)
        {
          a=a+1;
          printf("%d ",a);
        }
        else
        {
          b=b+1;
          printf("%d ",b);
        }
      }
    }
  }
}