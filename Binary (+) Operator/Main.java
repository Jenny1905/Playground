#include<iostream>
using namespace std;
class Binary
{
  private:
  int num1,num2;
  public:
  void  get()
  {
    cin>>num1>>num2;
  }
  void put()
  {
    cout<<"Number is: "<<num1+num2;
  }
  void operator + ()
  {
    num1=+num1;
  }
};
int main()
{
  Binary b;
  b.get();
  +b;
  b.put();
  return 0;
}
