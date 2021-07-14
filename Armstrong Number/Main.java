#include<stdio.h>
int main()
{
  int a,rem,b=0;
  scanf("%d",&a);
  int n=a;
  while(n>0)
  {
    rem=n%10;
    b=rem*rem*rem+b;
    n=n/10;
  }
  if(b==a)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not Armstrong Number");
  }
  
  
}