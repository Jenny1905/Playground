#include<iostream>
using namespace std;
class Parent
{
  private:
  int a,b;
  public:
  void read();
  void print();
};
void Parent :: read()
{
  cin>>a>>b;
}
void Parent :: print()
{
  cout<<"a = "<<a<<endl<<"b = "<<b;
}
int main()
{
  Parent p;
  p.read();
  p.print();
  return 0;
}
  

