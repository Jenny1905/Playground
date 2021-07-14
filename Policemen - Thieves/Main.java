#include <iostream> 
#include <vector> 
#include <cmath> 
using namespace std;  
int policeThief(char arr[], int n, int k) 
{ 
	int res = 0; 
	vector<int> thi; 
	vector<int> pol; 

	for (int i = 0; i < n; i++) { 
		if (arr[i] == 'P') 
			pol.push_back(i); 
		else if (arr[i] == 'T') 
			thi.push_back(i); 
	} 

	
	int l = 0, r = 0; 
	while (l < thi.size() && r < pol.size()) { 

		if (abs(thi[l] - pol[r]) <= k) { 
			res++; 
			l++; 
			r++; 
		} 

		else if (thi[l] < pol[r]) 
			l++; 
		else
			r++; 
	} 

	return res; 
} 

int main() 
{ 
	int k, n; 
     int m;
	char arr1[m];
  	cin>>k; 

    for(int i=0;i<m;i++)
    {
      cin>>arr1[i];
    }
	n = sizeof(arr1) / sizeof(arr1[0]); 
	cout << "Maximum thieves caught: "
		<< policeThief(arr1, n, k) << endl; 

	

	

	return 0; 
} 
