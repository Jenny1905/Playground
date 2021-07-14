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
int height(struct node *root)
{
  if(root==NULL)
    return 0;
  else
  {
    int l=height(root->left);
    int r=height(root->right);
    if(l>r)
      return (l+1);
    else
      return (r+1);
  }
}
void printLevel(struct node *root,int level)
{
  if(root==NULL)
    return ;
  if(level==1)
    cout<<root->data<<" ";
  else if(level>1)
    printLevel(root->left,level-1);
  printLevel(root->right,level-1);
}
void PrintLevelOrder(struct node *root)
{
  int h=height(root);
  for(int i=1;i<=h;i++)
  {
    printLevel(root,i);
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
  cout<<"Level order Traversal:\n";
  PrintLevelOrder(root);
  return 0;
}
        