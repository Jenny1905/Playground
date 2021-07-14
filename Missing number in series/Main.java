#include <stdio.h> 
#include <limits.h> 
int findMissingUtil(int arr[], int low, int high, int diff) 
{ 
	if (high <= low) 
		return INT_MAX; 

	int mid = low + (high - low)/2; 

	
	if (arr[mid+1] - arr[mid] != diff) 
		return (arr[mid] + diff); 

	if (mid > 0 && arr[mid] - arr[mid-1] != diff) 
		return (arr[mid-1] + diff); 

	 
	if (arr[mid] == arr[0] + mid*diff) 
		return findMissingUtil(arr, mid+1, high, diff); 

	return findMissingUtil(arr, low, mid-1, diff); 
} 


int findMissing(int arr[], int n) 
{ 
	int diff = (arr[n-1] - arr[0])/n; 

	 
	return findMissingUtil(arr, 0, n-1, diff); 
} 

int main() 
{ 
  int size;
  scanf("%d",&size);
   int arr[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d\n",&arr[i]);
  }
	int n = sizeof(arr)/sizeof(arr[0]); 
	printf("%d",findMissing(arr, n)); 
	return 0; 
} 
