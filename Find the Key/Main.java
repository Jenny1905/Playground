#include<stdio.h>
int main(){
int n1,n2,n3,a[100];
scanf("%d%d%d",&n1,&n2,&n3);
int s1=n1/1000;
int s2=n2/1000;
int s3=n3/1000;


int l1=(n1/100)%10;
int l2=(n2/100)%10;
int l3=(n3/100)%10;

int ss1=(n1/10)%10;
int ss2=(n2/10)%10;
int ss3=(n3/10)%10;

int ll1=n1%10;
int ll2=n2%10;
int ll3=n3%10;

if (s1 <= s2 && s1 <= s3) 
    
        a[0]=s1;
  
    else if (s2 <= s1 && s2 <= s3) 
       
        a[0]=s2;
  
    else
       
        a[0]=s3;
        
  


if (l1 >= l2 && l1>= l3) 

        a[1]=l1;
  
    else if (l2>= l1 && l2 >= l3) 
       
        a[1]=l2;
  
    else
       
       a[1]=l3;


if (ss1 <= ss2 && ss1 <= ss3) 
    
        a[2]=ss1;
  
    else if (ss2 <= ss1 && ss2 <= ss3) 
       
        a[2]=ss2;
  
    else
       
        a[2]=ss3;




if (ll1 >= ll2 && ll1>= ll3) 

        a[3]=ll1;
  
    else if (ll2>= ll1 && ll2 >= ll3) 
       
        a[3]=ll2;
  
    else
       
       a[3]=ll3;

int res=a[0]*1000+a[1]*100+a[2]*10+a[3]*1;
printf("%d",res);
}