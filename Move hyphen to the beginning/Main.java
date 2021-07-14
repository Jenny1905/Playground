// CPP program to bring all spaces in front of 
// string using swapping technique 
#include<bits/stdc++.h> 
using namespace std; 

// Function to find spaces and move to beginning 
void moveSpaceInFront(char str[]) 
{ 
	// Traverse from end and swap spaces 
	int i = strlen(str)-1; 
	for (int j = i; j >= 0; j--) 
		if (str[j] != '-') 
			swap(str[i--], str[j]); 
} 

// Driver code 
int main() 
{ 
	char str[100]; 
  cin>>str;
	moveSpaceInFront(str); 
	cout << str; 
	return 0; 
} 
