#include<stdio.h>
int main()
{
  int n,a=1,b=4;
  printf("Enter n value");
  scanf("%d",&n);
  printf("%d %d ",a,b);
  for(int i=3;i<=n;i++)
  {
    if(i%2==1)
    {
      printf("%d ",i*i*i);
    }
    else
    {
      printf("%d ",i*i);
    }
  }
}