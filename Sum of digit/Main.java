#include<iostream>
using namespace std;
class Digit
{
  int n;
  public:
  int sumOfDigit(int n)
  {
    int sum=0;
    while(n!=0)
    {
      sum=sum+n%10;
      n=n/10;
    }
    return sum;
  }
};
int main()
{
  Digit d;
  int n;
  cin>>n;
  cout<<d.sumOfDigit(n);
  return 0;
}
