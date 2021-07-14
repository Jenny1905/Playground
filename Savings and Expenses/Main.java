#include<stdio.h>
int main()
{
 int s,b,h,f,p;
  scanf("%d %d %d %d %d",&s,&b,&h,&f,&p);
  if(s>(b+h+f+p))
  {
    printf("He can save the money");
  }
  else if(s==(b+h+f+p))
  {
    printf("He can manage the expenses");
  }
  else
  {
    printf("He has to work hard");
  }
}