#include<iostream>
using namespace std;
int stack[50],top=-1;
void push(int val)
{
  top++;
  stack[top]=val;
}
int main()
{
  int n,val;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>val;
    push(val);
  }
  if(top==-1)
  {
    cout<<"Stack is empty";
  }
  else
  {
    cout<<"Stack elements are: "<<endl;
  }
  for(int i=top;i>=0;i--)
  {
    cout<<stack[i]<<" ";
  }
  return 0;
}
  