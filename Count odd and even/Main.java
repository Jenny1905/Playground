#include<stdio.h>
int countEven(int n,int *a)
{
  int ec=0;
  for(int i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
    {
      ec++;
    }
  }
  return ec;
}
int countOdd(int n,int *a)
{
  int oc=0;
  for(int i=0;i<n;i++)
  {
    if(*(a+i)%2==1)
    {
      oc++;
    }
  }
  return oc;
}
int main()
{
  int *a,n,ec=0,oc=0;
  scanf("%d",&n);
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    scanf("%d",(a+i));
  }
  printf("Odd: %d\n",countOdd(n,a));
  printf("Even: %d",countEven(n,a));
}
 
  
