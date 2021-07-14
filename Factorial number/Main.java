#include<iostream>
using namespace std;
class Factorial
{
  public:
  	int fact(int n)//5
    {
      int f=1;
      for(int i=1;i<=n;i++)
      {
        f=f*i;//120
      }
      return f;
    }
};
int main()
{
  int n,f;
  cin>>n;
  Factorial obj;
  f=obj.fact(n);
  cout<<f;
  return 0;
}
  
      
