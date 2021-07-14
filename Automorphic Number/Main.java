#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n<0 || n>10)
  {
    printf("Invalid input");
  }
  else if(n*n%10==n || n*n%100==n || n*n%1000==n)
  {
    printf("Automorphic Number");
  }
  else
  {
    printf("Not Automorphic Number");
  }
    
  
}