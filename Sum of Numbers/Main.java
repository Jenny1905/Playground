#include<stdio.h>
int main()
{
  int i,sum=0;
  do
  {
    scanf("%d\n",&i);
    if(i!=-1)
    {
      sum=sum+i;
    }
  }while(i!=-1);
  printf("%d",sum);
}
  
