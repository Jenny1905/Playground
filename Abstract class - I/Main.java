#include<iostream>
using namespace std;
class Base
{
   protected:
  int n;
  public:
  virtual void draw(int n)=0;
  
  
};
class Rectangle : public Base
{
public:
 void draw(int n)
 {
  
 
 cout<<"Rectangle"<<endl;
 cout<<"The given input is "<<n<<endl;
 }
 };
class Circle : public Base
{
public:
 void draw(int n)
 {

 cout<<"Circle"<<endl;
 cout<<"The given input is "<<n<<endl;
 }
 };
 int main()
 {
   int n;
   cin>>n;
   Rectangle r;
   Circle c;
   r.draw(n);
   c.draw(n);
  
 }