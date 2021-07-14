#include<iostream>
using namespace std;
int main()
{
  int target,attempt=0,score,sum=0;
  cin>>target;
  while(sum<target)
  {
    cin>>score;
    sum=sum+score;//1000
    attempt++;//0
  }
  cout<<"The number of turns is "<<attempt;
  
    
}