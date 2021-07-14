#include<iostream>
using namespace std;

bool search(int ar[], int n, int k) {
  if (n < 0)
    return false;
  if (ar[n] == k)
    return true;
  else 
    return (search(ar, n-1, k));
  
 
}

int main() {
  int n, k;
  cin >> n;
  int ar[n];
  for (int i = 0; i < n; i++)
    cin >> ar[i];
  cin >> k;
  if (search(ar, n, k))
    cout << k;
  else
    cout << "The number is not present in the list";
}