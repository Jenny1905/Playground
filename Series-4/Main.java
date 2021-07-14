#include<stdio.h>
int main()
{
  int n,a=0,b=3;
  printf("Enter n value\n");
  scanf("%d",&n);
  printf("%d ",a);
  for(int i=2;i<=n;i++)
  {
    a=a+b;
    printf("%d ",a);
    b=b+2;
  }
  
}