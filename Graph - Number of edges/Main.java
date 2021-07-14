#include<stdio.h>


int totEdge(int n) 
{ 
	int result = 0; 

	result = (n * (n - 1)) / 2; 

	return result; 
} 

// Driver Code 
int main() 
{ 
	int n;
	scanf("%d",&n);
	printf("%d",totEdge(n));


	return 0; 
} 
