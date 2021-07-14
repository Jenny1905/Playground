#include<stdio.h>
void solve(int a[], int n) 
{ 
	int maxx = -1, minn = a[0], l = 0, r = 0; 
	for (int i = 0; i < n; i++) { 

		if (a[i] > maxx) { 
			maxx = a[i]; 
			l = i; 
		} 

		if (a[i] <= minn) { 
			minn = a[i]; 
			r = i; 
		} 
	} 
	if (r < l) 
		printf("%d",l + (n - r - 2)); 
	else
		printf("%d",l + (n - r - 1)); 
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
	solve(arr, n); 
	return 0; 
} 
