#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node *next;
};
struct node *head;
void enqueue(int val)
{
  struct node *newnode;
  struct node *temp=head;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
    head=newnode;
  else
  {
    while(temp->next!=NULL)
    {
      temp=temp->next;
    }
    temp->next=newnode;
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
  do
  {
    cin>>val;
    if(val>=0)
      enqueue(val);
  }while(val>=0);
  display();
  return 0;
}