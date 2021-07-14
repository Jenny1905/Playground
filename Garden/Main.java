#include<iostream>
using namespace std;
class Circle
{
  int r;
  float area;
  public:
  Circle()
  {
    cout<<"Enter the value of Radius :\n";
    cin>>r;
  }
  void calculate();
  void display();
};
void Circle :: calculate()
{
  area=3.14*r*r;
}
void Circle :: display()
{
  cout<<"Area of Circle : "<<area;
}
int main()
{
  Circle c;
  c.calculate();
  c.display();
}
  
    
  
  
