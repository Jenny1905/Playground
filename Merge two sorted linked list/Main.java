#include<iostream>
#include<cstdlib>
using namespace std;
struct node
{
 int data;
 struct node *next;
};
struct node *heada = NULL;
struct node *headb = NULL;
void print(struct node *ptr)
{
  while(ptr!=NULL)
  {
    cout<<ptr->data<<"->";
    ptr=ptr->next;
  }
  cout<<"NULL";
}

struct node* SortedMerge(struct node* a, struct node* b) 
{ 
	struct node *result = NULL; 
	if (a == NULL) 
		return(b); 
	else if (b == NULL) 
		return(a); 
	if (a->data <= b->data) 
	{ 
		result = a; 
		result->next = SortedMerge(a->next, b); 
	} 
	else
	{ 
		result = b; 
		result->next = SortedMerge(a, b->next); 
	} 
	return(result); 
} 


int main()
{
  int m,n,i=0,item;
  	cin>>m;
  	while(i<m)
    {
      cin>>item;
  	  struct node *a = (struct node*)malloc(sizeof(struct node));     
      a->next=NULL;
      a->data=item;
      if(heada==NULL)
      {
      	heada=a;
      }
      else
      {
      		struct node *tempa = heada;
        	while(tempa->next!=NULL)
            {
            	tempa = tempa->next;
            }
        	tempa->next=a;
      }
      i++;
    }
   cin>>n;
   i=0;
   while(i<n)
   {
  	  cin>>item;
  	  struct node *b = (struct node*)malloc(sizeof(struct node));     
      b->next=NULL;
      b->data=item;
      if(headb==NULL)
      {
      	headb=b;
      }
      else
      {
      		struct node *tempb = headb;
        	while(tempb->next!=NULL)
            {
            	tempb = tempb->next;
            }
        	tempb->next=b;
      }
     i++;
   }
  ////////////////
  /*
  struct node *temp = headb;
  while(temp!=NULL)
  {
  	cout<<temp->data<<" ";
    temp=temp->next;
  }
  */
  ////////////
    struct node *last = SortedMerge(heada,headb);
    print(last);
}