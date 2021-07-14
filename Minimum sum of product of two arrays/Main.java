#include<stdio.h>
int main()
{
 int m[10],i,min,max,k,n,p=1,sum=0,u[10],mins;
 scanf("%d",&n);
 for(i=0;i<n;i++)
 scanf("%d",&u[i]);
 for(i=0;i<n;i++)
 scanf("%d",&m[i]);
 scanf("%d",&k);
 min=m[0];
 max=m[0];
 for(i=0;i<n;i++)
 {
  if(m[i]<min)
  min=m[i];
  if(m[i]>max)
  max=m[i];
 }
 if (min<0&&max<0)
 mins=min<max?min:max;
 else if(min>0&&max>0)
 mins=max>min?max:min;
 else
 {
 if((min-max)<-(2*min))
  mins=min;
  else 
  mins=max;
 }
 for(i=0;i<n;i++)
 {
  if(mins==m[i]&&mins>0)
   {
u[i]=u[i]-(2*k);
   goto x;
   }
   if(mins==m[i]&&mins<0)
    { 
    u[i]=u[i]+(2*k);
    goto x;
    }
  }
x:for(i=0;i<n;i++)
 {
 p=u[i]*m[i];
 sum=sum+p;
 }
 printf("%d",sum);
 return 0;
 
}