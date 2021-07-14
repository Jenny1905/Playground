#include <stdio.h>
void findProduct(int arr[], int n)
{
	int left[n], right[n];

	left[0] = 1;
	for (int i = 1; i < n; i++)
		left[i] = arr[i - 1] * left[i - 1];

	right[n - 1] = 1;
	for (int j = n - 2; j >= 0; j--)
		right[j] = arr[j + 1] * right[j + 1];

	for (int i = 0; i < n; i++)
		arr[i] = left[i] * right[i];
}

int main(void)
{
  int size;
  scanf("%d",&size);
	int arr[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d\n",&arr[i]);
  }
	int n = sizeof(arr) / sizeof(arr[0]);

	findProduct(arr, n);

	for (int i = 0; i < n; i++)
		printf("%d\n", arr[i]);

	return 0;
}