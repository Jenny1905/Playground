#include<stdio.h>
  void main()
  {
  int  arra[100],i,n,x,f,l,m,flag=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&arra[i]);
  scanf("%d",&x);
  /* Binary Search  logic */
  f=0;l=n-1;
  while(f<=l)
  {
  m=(f+l)/2;
  if(x==arra[m])
  {
  flag=1;
  break;
  }
  else  if(x<arra[m])
  l=m-1;
  else
  f=m+1;
  }
  if(flag==0)
  printf("Not found");
  else
  printf("%d",m);
  }
