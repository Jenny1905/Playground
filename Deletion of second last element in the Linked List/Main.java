#include<iostream>
#include<cstdlib>
using namespace std;
struct node
{
 int data;
 struct node *next;
};
struct node *head = NULL;
int main()
{
  int n,item,count=0;
  int flag=0;
  while(1)
  {
  	cin>>item;
    if(item<0)
    {
    	break;
    }
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data=item;
    newnode->next=NULL;
    if(head==NULL)
    {
    head=newnode;
    }
    else
    {
    	struct node *temp = head;
      	while(temp->next!=NULL)
        {
        	temp=temp->next;
        }
      	temp->next=newnode;
    }
    count++;
  }
  if(count<=2)
  {
  cout<<"Deletion of second last element is not possible";
  return 0;
  }
  struct node *a = head,*b;
  int i = 1;
  while(i!=count-1)
  {
    b=a;
    a=a->next;
    i++;
  }
  b->next=a->next;
  struct node *p = head;
  while(p!=NULL)
  {
  	cout<<p->data<<" ";
    p=p->next;
  }
  }
