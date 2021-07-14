#include<bits/stdc++.h> 
using namespace std; 
string lcs(string &a, string &b) 
{ 
	int x = a.length(); 
	int y = b.length(); 

	int L[x+1][y+1]; 
	for (int i=0; i<=x; i++) 
	{ 
		for (int j=0; j<=y; j++) 
		{ 
			if (i == 0 || j == 0) 
				L[i][j] = 0; 
			else if (a[i-1] == b[j-1]) 
				L[i][j] = L[i-1][j-1] + 1; 
			else
				L[i][j] = max(L[i-1][j], L[i][j-1]); 
		} 
	} 
	int index = L[x][y]; 
	string lcs(index+1, ' '); 
	int i = x, j = y; 
	while (i > 0 && j > 0) 
	{ 
		if (a[i-1] == b[j-1]) 
		{ 
			lcs[index-1] = a[i-1]; 
			i--; 
			j--; 

			index--; 
		} 
      else if (L[i-1][j] > L[i][j-1]) 
			i--; 
		else
			j--; 
	} 

	return lcs; 
} 
string longestPalSubseq(string &name) 
{ 
	string rev = name; 
	reverse(rev.begin(), rev.end()); 
    return lcs(name, rev); 
} 
int main() 
{ 
	string name; 
    cin>>name;
	cout << longestPalSubseq(name); 
	return 0; 
} 
