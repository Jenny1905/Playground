#include<stdio.h>
int main()
{
  int n,a=1,b=2,c;
  printf("Enter n value\n");
  scanf("%d",&n);
  printf("%d %d ",a,b);
  for(int i=3;i<=n;i++)
  {
    c=a+b;
    printf("%d ",c);
    a=b;
    b=c;
  }
}