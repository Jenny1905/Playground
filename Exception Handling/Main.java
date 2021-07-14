#include<iostream>
using namespace std;
int main()
{
  double a,b;
  char s;
  cin>>a;
  if(a==0)
  {
    cout<<"Bad Operation";
    return 0;
  }
  cin>>s;
  if(!(s=='+' || s=='-' || s=='*' || s=='/'))
  {
    cout<<"It is not a Valid Operator";
       return 0;
  }
  cin>>b;
  if(b==0)
  {
    cout<<"Bad Operation";
    return 0;
  }
  double res;
  switch(s)
  {
    case '+': res= a+b; break;
    case '-': res= a-b; break;
    case '*': res= a*b; break;
    case '/': res= a/b; break;
  }
  cout<<a<<" "<<s<<" "<<b<<" "<<"="<<" "<<res;
  
	//type your code here;
	return 0;
}