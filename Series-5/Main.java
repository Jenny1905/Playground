#include<stdio.h>
int main()
{
  int n,a=2;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    printf("%d ",a);
    a=a*2-i;
  }
}