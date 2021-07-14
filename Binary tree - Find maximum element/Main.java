#include<iostream>
 
using namespace std;
 
// A structure representing a node of a tree.
struct node
{
	int data;
	node *left;
	node *right;
};
 
// A function creating new node of tree and assigning the data.
node* CreateNode(int data)
{
	node *newnode = new node;
	newnode->data = data;
	newnode->left = NULL;
	newnode->right = NULL;
 
	return newnode;
}
 
// A function creating binary search tree.
node* InsertIntoTree(node* root, int data)
{
	// Create node using data from argument list.
	node *temp = CreateNode(data);
	node *t = new node;
	t = root;
 
	// If root is null, assign it to the node created.
	if(root == NULL)
		root = temp;
	else	
	{
		// Find the position for the new node to be inserted.
		while(t != NULL)
		{
			if(t->data < data )
			{
				if(t->right == NULL)
				{
					// If current node is NULL then insert the node.
					t->right = temp;
					break;
				}
				// Shift pointer to the left.
				t = t->right;
			}
 
			else if(t->data > data)
			{
				if(t->left == NULL)
				{
					// If current node is NULL then insert the node.
					t->left = temp;
					break;
				}
				// Shift pointer to the left.	
				t = t->left;
			}
		}
	}
	return root;
}
 
 
int main()
{
	char ch;
	int n, i, a[20];
  for(i=0;i<20;i++)
  {
    
    cin>>a[i];
    
  }
	node *root = new node;
	root = NULL;
 
	// Construct the BST.
//	cout<<"\nData set:\n";
	for(i = 0; i < 20; i++)
	{
      if(a[i]>0)
      {
	//	cout<<a[i]<<" ";
		root = InsertIntoTree(root, a[i]);
      }
      else
        break;
	}
 
	// Traverse to the rightmost child node to get maximum of the given data.
	cout<<"Maximum element is ";
	i = 0;
	while(root->right != NULL)
	{
		i++;
		root = root->right;
	}
	cout<<root->data;//" found at "<<i<<" depth from the root.";
 
	return 0;
}