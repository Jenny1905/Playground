#include<iostream>
using namespace std;
class Y
{
int tmt_mom,tmt_dad;
public:
void add(int m,int l)
{
	tmt_mom=m+l;
 }
 void add(int m,int l,int b)
 {
 tmt_dad=m+l+b;
 }
 void display()
 {
 cout<<tmt_mom<<endl;
 cout<<tmt_dad;
 }
 };
 int main()
 {
   int m,l,b;
   cin>>m>>l>>b;
 Y obj;
 
 obj.add(m,l);
 obj.add(m,l,b);
 obj.display();
 return 0;
 }
 
    

