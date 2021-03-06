#include<iostream>
using namespace std;
struct node
{
  int data;
  struct node *left,*right;
};
struct node *root;
void insert(int data)
{
  struct node *newNode;
  newNode=(struct node*)malloc(sizeof(struct node));
  newNode->data=data;
  newNode->left=NULL;
  newNode->right=NULL;
  struct node *temp=root;
  if(root==NULL)
  {
    root=newNode;
  }
  else
  {
    while(true)
    {
      if(data<temp->data)
      {
        if(temp->left!=NULL)
          temp=temp->left;
        else
        {
          temp->left=newNode;
          break;
        }
      }
      else
      {
       	if(temp->right!=NULL)
          temp=temp->right;
        else
        {
          temp->right=newNode;
          break;
        }
      }
    }
  }
}
struct node *display(struct node  *temp)
{
  if(temp==NULL)
    return NULL;
  cout<<temp->data<<" ";
  display(temp->left);
  display(temp->right);
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
  cout<<"Preorder Traversal:\n";
  display(root);
  return 0;
}
    
  