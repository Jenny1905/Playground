#include<iostream>
#include<stdexcept>
using namespace std;
class Exception:public runtime_error
{
public:
Exception():runtime_error("first round not cleared")
{
}
};
int main()
{
  int num;
  cin>>num;
  try
  {
  if(num<=50)
  {
    	throw Exception();
  }
  else
  {
    cout<<"first round cleared"<<endl;
    cout<<"eligible for second round";
  }
}
  catch(Exception e)
  {
    cout<<"first round not cleared";
  }
}
    
  
  