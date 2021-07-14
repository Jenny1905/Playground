#include<stdio.h>
#include<stdlib.h>
int main()
{
  int n,sum=0;
  int *a;
  scanf("%d",&n);
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  for(int i=0;i<n;i++)
  {
    sum=sum + *(a+i);
  }
  printf("%d",sum);
  
  
}