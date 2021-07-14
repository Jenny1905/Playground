#include<stdio.h>
int main()
{
  int p,r,n;
  scanf("%d %d %d",&p,&r,&n);
  float si,a,d,fs;
  si=(p*r*n)/100;
  a=p+si;
  d=0.02*si;
  fs=a-d;
  printf("%0.2f\n",si);
  printf("%0.2f\n",a);
  printf("%0.2f\n",d);
  printf("%0.2f",fs);
}