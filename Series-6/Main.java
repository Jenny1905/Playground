#include<stdio.h>
#include<math.h>
int main()
{
  int n,p;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    p=pow(i,i);
    printf("%d ",p);
  }
}