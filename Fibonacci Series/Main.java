#include<iostream>
using namespace std;
int fb(int n);
int fb(int n)
{
  if(n==1)
  {
    return 0;
  }
  else if(n==2)
  {
    return 1;
  }
  else
  {
    return (fb(n-1)+fb(n-2));
  }
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fb(n);
  return 0;
}