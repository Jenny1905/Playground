#include<iostream>
using namespace std;
struct node
{
  int data;
  struct node *next;
}
*head=NULL;
void push(int val)
{
  struct node *temp=head;
  struct node *newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
  {
    head=newnode;
  }
  else
  {
    newnode->next=temp;
    head=newnode;
  }
}
void display()
{
  struct node *temp=head;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp=temp->next;
  }
}
  
int main()
{
  int val;
  while(1)
  {
    cin>>val;
    if(val>0)
    {
      push(val);
    }
    else
    {
      break;
    }
  }
  if(head==NULL)
  {
    cout<<"Stack is empty"<<endl;
  }
  else
  {
    display();
  }
  return 0;
}
      
  
    
    
  