#include<iostream>
#include<stdexcept>
using namespace std;
class Exception:public runtime_error
{
public:
Exception():runtime_error("Exception: Division by zero")
{
}
};
float division(float num,float den)
{
  if(den==0)
    throw Exception();
  return (num/den);
}
int main()
{
  float num,den,res;
  
  cin>>num>>den;
  try
  {
  res=division(num,den);
  cout<<"Enter two numbers:\n";
  cout<<"a/b = "<<res;
  }
  catch(Exception e)
  {
    cout<<"Enter two numbers:"<<endl<<e.what();
  }
}
    
