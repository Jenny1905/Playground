#include<iostream>
using namespace std;
class Arithmetic
{
  private:
  int a,b,c,d,e,f,x,y;
  int sum,diff,mul,divi;
  public:
  int get();
  int display();
};
int Arithmetic :: get()
{
  cin>>a>>b>>c>>d>>e>>f>>x>>y;
  sum=a+b;
  diff=c-d;
  mul=e*f;
  divi=x/y;
  cout<<sum<<endl;
  cout<<diff<<endl;
  cout<<mul<<endl;
  cout<<divi;
}
int Arithmetic :: display()
{
  int result;
  result=get();
}
int main()
{
  Arithmetic t;
  t.display();
}
  
  