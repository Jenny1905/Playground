#include<stdio.h>
#include<stdlib.h>
struct Node
{
        int data;
        struct Node *left,*right;
};
typedef struct Node Node;
void append(Node **rootadd,int data)
{
    Node *temp,*newnode;
    temp = *rootadd;
    newnode = (Node*)malloc(sizeof(Node));
    newnode->left = NULL;
    newnode->data = data;
    newnode->right = NULL;
    if(*rootadd == NULL)
        *rootadd = newnode;
    else
    {
        while(1)
        {
            if(data > temp->data)
            {
                if(temp->right != NULL)
                {
                    temp = temp->right;
                }
                else
                {
                    temp->right = newnode;
                    break;
                }
            }
            else
            {
                if(temp->left != NULL)
                {
                    temp = temp->left;
                }
                else
                {
                    temp->left = newnode;
                    break;
                }
            }
        }
    }
}
int KSmallestUsingMorris(Node *root, int k) 
{ 
    int count = 0; 
    int ksmall = -1; 
    Node *curr = root;
    while (curr != NULL) 
    { 
        if (curr->left == NULL) 
        { 
            count++; 
            if (count==k) 
                ksmall = curr->data; 
            curr = curr->right; 
        } 
        else
        { 
            Node *pre = curr->left; 
            while (pre->right != NULL && pre->right != curr) 
                pre = pre->right; 
            if (pre->right==NULL) 
            { 
                pre->right = curr; 
                curr = curr->left; 
            } 
            else
            { 
                pre->right = NULL; 
                count++; 
                if (count==k) 
                    ksmall = curr->data; 
                curr = curr->right; 
            } 
        } 
    } 
    return ksmall; 
}     
int main()
{
    Node *root = NULL;
    int data,k;
    do
    {
        scanf("%d", &data);
        if(data > 0)
            append(&root,data);
    }while(data > 0);
    printf("Enter the kth value:\n");
    scanf("%d", &k);
    printf("Smallest kth value %d",KSmallestUsingMorris(root,k));
    return 0;
}