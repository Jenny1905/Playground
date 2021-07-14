#include<stdio.h>
int main()
{
  int d,y,w,m;
  scanf("%d",&d);
  w=d/365;
  int z=0;
  z=d%365;
  m=z/7;
  z=z%7;
  y=z;
  printf("%d\n%d\n%d",w,m,y);
  
}