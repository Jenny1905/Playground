#include<iostream>
using namespace std;
int main()
{
 
  int a,x=0;
  float res=0.0;
  do
  {
    cin>>a;
    if(a%2==1 && a>0)
    {
      res=res+1.0;
      x=x+1.0;
    }
   else if(a%2==0 && a>0)
   {
     res=res-0.5;
   }
    else if(a<0)
    {
      res=res-1.0;
      break;
    }
  }while(x<3);
  cout<<res;
}
  
        
    
      
    
