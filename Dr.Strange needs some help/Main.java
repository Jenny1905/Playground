#include<iostream>
#include<math.h>
using namespace std;
int exper();
int exper()
{
  int m,n,req;
  cin>>m>>n>>req;
  int a=pow(m,n);
  if(a>=req)
  	return true;
  else
    return false;
}
int main()
{
	if(exper()==1)
      cout<<"Doctor, you can proceed with your experiment."<<endl;
  	else
      cout<<"Sorry Doctor! You need more bacteria.";
}


