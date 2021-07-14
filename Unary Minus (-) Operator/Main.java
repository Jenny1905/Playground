#include<iostream>
using namespace std;
class Unary
{
  private:
  int n;
  public:
  void get()
  {
    cin>>n;
  }
  void display()
  {
    cout<<"value of n is: "<<n;
  }
  void operator - ()
  {
    n=-n;
  }
};
int main()
{
  Unary u;
  u.get();
  -u;
  u.display();
  return 0;
}
  
      
    
      
      
      
      
    