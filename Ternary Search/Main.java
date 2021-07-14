#include <stdio.h> 
int ternarySearch(int l, int r, int key, int ar[]) 
{ 
    while (r >= l) { 
        int mid1 = l + (r - l) / 3; 
        int mid2 = r - (r - l) / 3; 
        if (ar[mid1] == key) { 
            return mid1; 
        } 
        if (ar[mid2] == key) { 
            return mid2; 
        } 
        if (key < ar[mid1]) { 
            r = mid1 - 1; 
        } 
        else if (key > ar[mid2]) { 
            l = mid2 + 1; 
        } 
        else { 
            l = mid1 + 1; 
            r = mid2 - 1; 
        } 
    } 
    return -1; 
} 
int main() 
{ 
    int n, l, r, p, key; 
    scanf("%d", &n);
    int ar[n];
    for(int i = 0; i < n; i++)
        scanf("%d", &ar[i]);
    scanf("%d", &key);
     
    l = 0, r = n - 1;
    p = ternarySearch(l, r, key, ar); 
    if(p == -1)
        printf("Element not found");
    else
        printf("%d found at location %d.", key, p+1); 
}