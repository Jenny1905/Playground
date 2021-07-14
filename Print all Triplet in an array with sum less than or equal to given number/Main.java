#include <iostream>
#include <algorithm>
using namespace std;

// Function to print all distinct triplets in the array with sum
// less than or equal to given number
void printAllTriplets(int A[], int n, int sum)
{
	// sort the array in ascending order
	sort(A, A + n);

	// check if triplet is formed by A[i] and a pair from
	// sub-array A[i+1..n)
	for (int i = 0; i <= n - 3; i++)
	{
		// maintain two indexes pointing to end-points of the
		// sub-array A[i+1..n)
		int low = i + 1, high = n - 1;

		// loop till low is less than high
		while (low < high)
		{
			// decrement high is total is more than the remaining sum
			if (A[i] + A[low] + A[high] > sum)
				high--;

			else
			{
				// if total is less than or equal to the remaining sum,
				// print all triplets
				for (int x = low + 1; x <= high; x++)
					cout << "(" << A[i] << ", " << A[low] << ", " << A[x] << ")"<<endl;

				low++;  // increment low
			}
		}
	}
}

int main()
{
  int m;
  cin>>m;
	int A[m];
  for(int i=0;i<m;i++)
  {
    cin>>A[i];
  }
	int sum ;
  cin>>sum;

	int n = sizeof(A) / sizeof(A[0]);

	printAllTriplets(A, n, sum);

	return 0;
}