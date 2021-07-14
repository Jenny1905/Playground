#include<stdio.h>
int main()
{
  int a,rem,rev=0;
  scanf("%d",&a);
  int n=a;
  while(n>0)
  {
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
  }
  if(rev==a)
  {
    printf("Same");
  }
  else
  {
	printf("Not Same");
  }
  
}