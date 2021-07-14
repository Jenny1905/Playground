#include<iostream>
#include<math.h>
using namespace std;
int power(int a, int n);
int main() 
{
    int  a,n, result;
    cout<<"Enter the value of a";
    cin>>a;
    cout<<"\nEnter the value of n";
    cin>>n;
    result = pow(a,n);
   cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<result; 
    return 0;
}

int power(int a, int n) {
    if (n != 0)
        return (a * power(a, n - 1));
    else
        return 1;
}