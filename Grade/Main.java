#include<iostream>
using namespace std;
class Basic
{
  private:
  char name[30];
  int age;
  char gender;
  public:
  void get();
  void put();
};
void Basic :: get()
{
  cout<<"Enter student's basic information:"<<endl;
  cout<<"Name: "<<endl;
  cin>>name;
  cout<<"Age: "<<endl;
  cin>>age;
  cout<<"Gender: "<<endl;
  cin>>gender;
}
void Basic :: put()
{
  cout<<"Name: "<<name<<endl;
  cout<<"Age: "<<age<<endl;
  cout<<"Gender: "<<gender<<endl;
}
class Result : public Basic
{
  private:
  int total;
  float percentage;
  char grade;
  public:
  void get1();
  void put1();
};
void Result :: get1()
{
  cout<<"\nEnter student's result information:"<<endl;
  cout<<"Total Marks: "<<endl;
  cin>>total;
  percentage=(float)((total*100)/500);
  cout<<"Grade: "<<endl;
  cin>>grade;
}
void Result :: put1()
{
  cout<<"Total Marks: "<<total<<endl;
  cout<<"Percentage: "<<percentage<<endl;
  cout<<"Grade: "<<grade;
}
int main()
{
  Result r;
  r.get();
  r.get1();
  r.put();
  r.put1();
  return 0;
}
  
  
  