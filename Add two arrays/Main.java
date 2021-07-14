#include<stdio.h>
int main()
{
  int n;
  int *a,*b,*c;
  scanf("%d",&n);
  a=(int*)malloc(n*sizeof(int));
  b=(int*)malloc(n*sizeof(int));
  c=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",a+i);
  }
  for(int i=0;i<n;i++)
  {
    scanf("%d",b+i);
  }
  for(int i=0;i<n;i++)
  {
    *(c+i)=*(a+i)+*(b+i);
    printf("%d ",*(c+i));
  }
  
  
}