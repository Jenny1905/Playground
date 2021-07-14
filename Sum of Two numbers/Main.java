#include<iostream>
using namespace std;
class Sum
{
  protected:
  	int a,b;
  public:
  void display1()
  {
    cout<<"Enter the integer value of class A:\n";
    cin>>a;
    cout<<"Enter the integer value of class B:\n";
    cin>>b;
  }
};
class Addition : public Sum
{
int add;
public:
void add1()
{
add=a+b;
}
void display2()
{
cout<<"The sum of two numbers: "<<add;
}
};
int main()
{
Addition s;
s.display1();
s.add1();
s.display2();
return 0;
}  
    