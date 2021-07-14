#include<stdio.h> 
void printMaxActivities(int s[], int f[], int n) 
{ 
	int i, j; 


	i = 0; 
	printf("%d ", i); 

	for (j = 1; j < n; j++) 
	{ 
	
	if (s[j] >= f[i]) 
	{ 
		printf ("%d ", j); 
		i = j; 
	} 
	} 
} 

int main() 
{ 
  int m;
  scanf("%d",&m);
	int s[m]; 
  for(int i=0;i<m;i++)
  {
    scanf("%d",&s[i]);
  }
	int f[m];
  for(int i=0;i<m;i++)
  {
    scanf("%d",&f[i]);
  }
	int n = sizeof(s)/sizeof(s[0]); 
	printMaxActivities(s, f, n); 
	return 0; 
} 
