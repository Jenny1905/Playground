#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void printadjmatrix(int **A,int rows)
{
	int i,j;
	printf("Adjacency Matrix Representation:\n");
	for(i=1;i<=rows;i++)
	{
		for(j=1;j<=rows;j++)
		{
		    printf("%d ", A[i][j]);
		}
	    printf("\n");
    }
}
int main()
{
    int **A,rows,edges,snode,enode,weight,i;
	char directed[4];
	printf("Please enter the number of nodes in the graph\n");
	scanf("%d", &rows);
	printf("Please enter the number of edges in the graph\n");
	scanf("%d", &edges);
	printf("Is the graph directed\n");
	scanf("%s", directed);
	A = (int **)malloc(rows * sizeof(int *));
	for(i=1;i<=rows;i++)
		*(A+i)=(int *)calloc(rows,sizeof(int));
	printadjmatrix(A,rows);
	for(i = 1;i<=edges;i++)
	{
		printf("Enter the start node, end node and weight of edge no %d\n", i);
		scanf("%d %d %d", &snode, &enode, &weight);
		if(strcmp(directed,"yes") == 0)
			A[snode][enode]=weight;
		else
		{
			A[snode][enode]=weight;
			A[enode][snode]=weight;
		}
	}
    printadjmatrix(A,rows);
    return 0;
}