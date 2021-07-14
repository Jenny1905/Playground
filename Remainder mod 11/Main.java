// CPP implementation to find remainder 
// when a large number is divided by 11 
#include <bits/stdc++.h> 
using namespace std; 

// Function to return remainder 
int remainder(string str) 
{ 
	// len is variable to store the 
	// length of number string. 
	int len = str.length(); 

	int num, rem = 0; 

	// loop that find remainder 
	for (int i = 0; i < len; i++) { 
		num = rem * 10 + (str[i] - '0'); 
		rem = num % 11; 
	} 

	return rem; 
} 

// Driver code 
int main() 
{ 
	string str ;
  cin>>str;
	cout << remainder(str); 
	return 0; 
} 
