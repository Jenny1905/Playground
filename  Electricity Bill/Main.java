#include<iostream>
using namespace std;
class Ebill
{
  public:
  int b_no;
  char name[20];
  int units;
  int bill;
  public:
  void get()
  {
    cin>>b_no;
    cin>>name;
    cin>>units;
  }
  void put()
  {
    cout<<b_no<<endl;
    cout<<name<<endl;
    cout<<units<<endl;
    cout<<bill;
  }
  void calculateBill()
  {
    if(units<=100)
      	bill=units*1.20;
    else if(units<=300)
      	bill=100*1.20+(units-100)*2;
    else
      bill=100*1.20+200*2+(units-300)*3;
  }
};
  int main()
  {
    Ebill e;
    e.get();
    e.calculateBill();
    e.put();
  }
    
    