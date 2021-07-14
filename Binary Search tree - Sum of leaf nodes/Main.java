#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node *left,*right;
};
struct node *root;
void insert(int data)
{
  struct node *newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=data;
  newnode->left=NULL;
  newnode->right=NULL;
  struct node *temp=root;
  if(root==NULL)
    root=newnode;
  else
  {
    while(1)
    {
      if(data>temp->data)
      {
        if(temp->right!=NULL)
        {
          temp=temp->right;
        }
        else
        {
          temp->right=newnode;
          break;
        }
      }
      else
      {
        
        if(temp->left!=NULL)
        {
          temp=temp->left;
        }
        else
        {
          temp->left=newnode;
          break;
        }
      }
    }
  }
}
int sumleaf(struct node *temp,int *sum)
{
  
  if(temp==NULL)
    return NULL;
  if(temp->left==NULL  && temp->right==NULL)
    *sum=*sum+temp->data;
  sumleaf(temp->left,sum);
  sumleaf(temp->right,sum);
}
int main()
{
  int data;
  do
  {
    cin>>data;
    if(data>=0)
      insert(data);
  }while(data>=0);
  int sum=0;
  sumleaf(root,&sum);
  
  cout<<"Sum of all leaf nodes are "<<sum;
  return 0;
}