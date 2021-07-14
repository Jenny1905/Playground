#include<iostream>
using namespace std;
int sum(int n);//fun declaration
int sum(int n)
{
    if(n!=0)
    {
        return n+sum(n-1);
    }
    else
    {
        return n;
    }
    
}
int main()
{
    int n,res;
    cin>>n;
    res=sum(n);//fun call
    cout<<res;
    return 0;
}


