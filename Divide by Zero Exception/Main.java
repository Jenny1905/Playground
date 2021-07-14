#include<iostream>
using namespace std;
float Checkdeno(float den)
{
  if(den==0)
  	throw 0;
  else
    return den;
}
int main()
{
  float num,den,res;
  cin>>num>>den;
  try
  {
    if(Checkdeno(den))
    {
      res=num/den;
      cout<<"The quotient is "<<res;
    }
  }
  catch(int e)
  {
    cout<<"Exception occurred"<<endl;
    cout<<"Math error: Attempted to divide by Zero";
  }
}
    
    
