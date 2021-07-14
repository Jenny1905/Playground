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
int search(int s)
{
  struct node *temp=root;
  while(temp!=NULL)
  {
    if(s<temp->data)
      temp=temp->left;
    else if(s>temp->data)
      temp=temp->right;
    else
      return 1;
    
  }
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
  cout<<"Enter the element to be searched:\n";
  int s;
  cin>>s;
  if(search(s))
    cout<<s<<" is present in the BST";
  else
    cout<<s<<" is not present in the BST";
  return 0;
}


  
    