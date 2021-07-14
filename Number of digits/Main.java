#include<iostream>
using namespace std;
int digit(int n);
int digit(int n)
{
 static int count=0;
  if(n>0)
  {
    count++;//0
    digit(n/10);//0
   }
  else
  {
    return count;//1
  }
}
int main()
{
  int n,count=0;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The number of digits in "<<n<<" is "<<digit(n);
  return 0;
}

  
