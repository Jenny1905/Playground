#include<stdio.h>
int main()
{
 int num;
  scanf("%d",&num);
  int sum=0,rem,n;
  n=num;
  //calculate sum of digit
  while(num>0)
  {
    rem=num%10;
    sum=sum+rem;
    num=num/10;
  }
  if(n%sum==0)
  {
    printf("Harshard Number");
  }
  else
  {
    printf("Not Harshard Number");
  }
}