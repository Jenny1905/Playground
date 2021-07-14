#include <stdio.h>
#include<stdlib.h>
struct node 
{ 
 
  int data; 
  struct node *next; 
}; 
struct node *root = NULL; 
void append(int d) 
{ 
    struct node *newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data = d;
    newnode->next = NULL;
    if(root == NULL)
    {
        root = newnode;
    }
    else
    {
        struct node *temp;
        temp = root;
        while(temp->next != NULL)
        {
            temp=temp->next;
        }
        temp->next = newnode;
    }
} 
void check(int d) 
{
  struct node *temp = root; 
   while (temp != NULL) 
   {
     if(temp->data == d)
       return;
         temp = temp->next; 

   }
  append(d);
}
void printList() 
{ 
if(root == NULL)
    printf("List is empty");
else
{
  while (root != NULL) 
  { 
    printf("%d\n",root->data); 
    root = root->next; 
  } 
}
} 


int main() 
{
  int d;
    do{
      scanf("%d",&d);
      if(d<0)
        break;
      check(d);
    }while(1);
  printList();
  return 0;
}