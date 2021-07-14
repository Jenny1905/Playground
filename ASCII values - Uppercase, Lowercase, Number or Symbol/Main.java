#include<stdio.h>
int main()
{
  char a;
  scanf("%c",&a);
  if(a>=65 && a<=90)
  {
    printf("Upper");
  }
  else if(a>=97 && a<=122)
  {
    printf("Lower");
  }
  else if(a>=48 && a<=57)
  {
    printf("Number");
  }
  else
  {
    printf("Symbol");
  }
  
}