#include <iostream> 
using namespace std; 
  
int max(int *arr, int n) 
{ 
    if (n == 0) 
        return 0; 
    if (n == 1) 
        return arr[0]; 
    if (n == 2) 
        return max(arr[0], arr[1]); 
    int dp[n]; 
  
    dp[0] = arr[0]; 
    dp[1] = max(arr[0], arr[1]); 
  
    for (int i = 2; i<n; i++) 
        dp[i] = max(arr[i]+dp[i-2], dp[i-1]); 
  
    return dp[n-1]; 
} 
  
int main() 
{ 
    int a,i,arr[100];
    scanf("%d",&a);
    for(i=0;i<a;i++){
        scanf("%d",&arr[i]);
    }
    cout<< max(arr, a); 
    return 0; 
}