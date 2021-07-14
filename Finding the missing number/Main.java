#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    int arr[n];
    for(int idx = 0; idx <= n - 1; idx++){
        scanf("%d", &arr[idx]);
    }
    int missing_val = 0;
    /* Check whether the 'value' is present in the given array
    If it is true, then reset 'is_found' value as false
    and stop your searching for the particular value.
    Otherwise, search till the end of an array
    If it is not existing, then store the 'value' in a variable'missing_val'
    and stop your searching further.
    */
    for(int val = 1; val <= n; val++)
    {
        int is_found = 0;
        for(int indx = 0; indx <= n - 1; indx++){
            if(arr[indx] == val)
            {
                is_found = 1;
                break;
            }
        }
        if(is_found == 0){
            missing_val = val;
            break;
        }
    }
    printf("%d", missing_val);
}