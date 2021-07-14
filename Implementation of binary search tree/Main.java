#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node *left,*right;
};
void insert(struct node **rootadd,int data)
{
  struct node *temp,*newnode;
  temp=*rootadd;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=data;
  newnode->left=NULL;
  newnode->right=NULL;
  if(*rootadd == NULL)
    *rootadd=newnode;
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
void traverse(struct node *root)
{
  if(root==NULL)
    return;
  traverse(root->left);
  cout<<root->data<<" ";
  traverse(root->right);
}
 int main()
 {
   struct node *root=NULL;
   int data;
   do
   {
     cin>>data;
     if(data>0)
       	insert(&root,data);
   }while(data>0);
   cout<<"Tree values are:\n";
   traverse(root);
   return 0;
 }