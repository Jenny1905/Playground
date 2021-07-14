#include<iostream>
using namespace std;
class Student
{
  public:
  int roll_no,s1,s2,t;
  public:
  void get();
  void put();
};
void Student :: get()
{
  cin>>roll_no>>s1>>s2;
  t=s1+s2;
  
}
void Student :: put()
{
  cout<<"Roll Number Is: "<<endl<<roll_no<<endl;
  cout<<"Subject 1:"<<s1<<endl;
  cout<<"Subject 2:"<<s2<<endl;
  cout<<"Total:"<<t;
}
int main()
{
  Student s;
  s.get();
  s.put();
  
}
  
  
  
  
