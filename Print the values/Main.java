#include<stdio.h>
int main()
{
  int *p,n;
  scanf("%d",&n);
  p=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",p+i);
  }
  for(int i=0;i<n;i++)
  {
    printf("%d\n",*(p+i));
  }
}