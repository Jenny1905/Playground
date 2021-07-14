#include<stdio.h>
#include<stdlib.h>
int main()
{
  int n,m,i,*a,*b,*c;
  int sum=0;
  a=(int*)malloc(n*sizeof(int));
  b=(int*)malloc(m*sizeof(int));
  c=(int*)malloc(4*sizeof(int));
  scanf("%d",&n);
  scanf("%d",&m);
  for(i=0;i<n*m;i++)
  {
    scanf("%d",(a+i));
  }
  for(i=0;i<n*m;i++)
  {
    scanf("%d",(b+i));
  }
  printf("The Result is:\n");
  for(i=0;i<n;i++)
  {
    *(c+i)= *(b+i)- *(a+i);
    printf("%d ",*(c+i));
  }
  printf("\n");
  for(i=i+0;i<n*m;i++)
  {
    *(c+i)= *(b+i)- *(a+i);
    printf("%d ", *(c+i));
  }
}
    
  
  
  
