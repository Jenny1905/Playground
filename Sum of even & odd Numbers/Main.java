#include<stdio.h>
int main()
{
  int i,sum1=0,sum2=0;
  float a,b,k=0.0,j=0.0;
  do
  {
    scanf("%d\n",&i);
    if(i!=-1)
    {
      if(i%2==0)
      {
        sum1=sum1+i;
        k++;
      }
      else
      {
        sum2=sum2+i;
        j++;
      }
    }
  }while(i!=-1);
  a=sum1/k;
  b=sum2/j;
  printf("%d\n",sum1);
  printf("%d\n",sum2);
  printf("%0.2f\n",a);
  printf("%0.2f",b);
  
}