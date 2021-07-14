#include<iostream>
using namespace std;
class Base
{
  public:
  int area1,area2;
  public:
  void getArea(int num1)
  {
    area1=num1*num1;
  }
  void getArea(int num2,int num3)
  {
    area2=num2*num3;
  }
  void display()
  {
    cout<<area1<<endl<<area2;
  }
};
int main()
{
  Base b;
  int num1,num2,num3;
 
  cin>>num1>>num2>>num3;
  b.getArea(num1);
  b.getArea(num2,num3);
  b.display();
  return 0;
}
  
  
  