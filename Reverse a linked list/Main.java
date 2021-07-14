#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node *next;
};
struct node *head=NULL;
struct node *current=NULL;
struct node *temp;
int main()
{
  int d;
  do
  {
    cin>>d;
    if(d>0)
    {
      struct node *newnode=(struct node*)malloc(sizeof(struct node));
      if(newnode==NULL)
      {
        cout<<"Error!";
        exit(0);
      }
      newnode->data=d;
      newnode->next=NULL;
      if(current==NULL)
      {
        head=newnode;
        current=newnode;
      }
      else
      {
        temp=current;
        current->next=newnode;
        current=newnode;
      }
    }
  }while(d>0);
  struct node *cursor=head;
  cout<<"Before Reversing the list:\n";
  while(cursor!=NULL)
  {
    cout<<cursor->data<<"\n";
    cursor=cursor->next;
  }
  cout<<"After Reversing the list:\n";
  struct node *cur=head;
  struct node *prev=NULL;
  struct node *nex=head;
  while(cur!=NULL)
  {
    nex=cur->next;
    cur->next=prev;
    prev=cur;
    cur=nex;
  }
  head=prev;
  cursor=head;
  while(cursor!=NULL)
  {
    cout<<cursor->data<<"\n";
    cursor=cursor->next;
  }
  return 0;
}
    
  
  
  
  
        
        
      
        
      
        
      
      
      


