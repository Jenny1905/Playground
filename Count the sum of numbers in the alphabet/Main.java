#include<iostream>
using namespace std;
int count(string str)
{
    string temp="";
    int sum=0;
    for(char c:str)
    {
        if(isdigit(c))
        {
            temp=temp+c;
        }
        else
        {
            sum=sum+atoi(temp.c_str());
            temp="";
        }
    }
    return sum+atoi(temp.c_str());
}
int main()
{
    string str;
    cin>>str;
    cout<<count(str);//fun call;
}
