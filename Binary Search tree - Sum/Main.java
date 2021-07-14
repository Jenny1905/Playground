#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node *left;
  struct node *right;
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
int sum(struct node *temp)
{
  if(temp==NULL)
    return 0;
  return temp->data+sum(temp->left)+sum(temp->right);
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
  cout<<"Sum of all nodes are "<<sum(root);
  return 0;
}
