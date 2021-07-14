#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int x=d%6;
  float tno=a/6;
  float of=(d/6)+(x*0.1);
  float crr=c/of;
  float nrr=b/tno;
  cout<<tno<<endl<<of<<endl;
    cout<<fixed<<setprecision(1)<<crr<<endl<<nrr;
  if(crr<nrr)
  {
    cout<<"\n" "Not Eligible to Win";
  }
  else
  {
    cout<<"\n" "Eligible to Win";
  }
}