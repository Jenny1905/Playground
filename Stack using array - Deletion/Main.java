#include<iostream>
using namespace std;
int stack[50],top=-1,n;
void push(int val)
{
  if(top>=n-1)
  {
    cout<<"Stack overflow"<<endl;
  }
  else
  {
    top++;
    stack[top]=val;
  }
}
void pop()
{
  if(top<=-1)
  {
    cout<<"Stack Underflow"<<endl;
  }
  else
  {
    cout<<"The popped element is "<<stack[top]<<endl;
    top--;
  }
}
void display()
{
  if(top>=0)
  {
    cout<<"Stack elements are:\n";
    for(int i=top;i>=0;i--)
      cout<<stack[i]<<" ";
    cout<<endl;
    
  }
  else
  
    cout<<"Stack is empty\n";
  
}
int main()
{
  int val,p;
  cin>>n;
  if(n>0)
  {
    for(int i=0;i<n;i++)
    {
      cin>>val;
      push(val);
    }
    cout<<"Before pop starts:\n";
    display();
    cout<<"Enter the number of values to be popped:\n";
    cin>>p;
    cout<<"After pop starts:\n";
    for(int i=0;i<p;i++)
    {
      cout<<"pop number: "<<i+1<<endl;
      pop();
      if(i+1<=n)
        display();
    }
  }
  else
  {
    cout<<"Stack is empty";
  }
}
    
    


      
    
    
    

