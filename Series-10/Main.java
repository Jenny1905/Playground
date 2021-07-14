#include<stdio.h>
int main()
{
  int n,b,c=0;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    b=2*i;
    c=c+b;
    printf("%d ",c);
  }
}