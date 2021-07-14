#include<iostream>
#include<string.h>
using namespace std;
class Bank
{
  int acc_no;
  char name[20],acc_type[20];
  int bal;
  public:
  Bank(int a_no,char *nm,char *type,int b)
  {
    acc_no=a_no;
    strcpy(name,nm);
    strcpy(acc_type,type);
    bal=b;
  }
  void deposit();
  void withdraw();
  void display();
};
void Bank :: deposit()
{
  int d;
  cout<<"Enter Deposit Amount =\n";
  cin>>d;
  bal=bal+d;
}
void Bank :: withdraw()
{
  int w;
  cout<<"Enter Withdraw Amount =\n";
  cin>>w;
  if(w>bal)
    	cout<<"Cannot Withdraw Amount"<<endl;
  bal=bal-w;
}
void Bank :: display()
{
  cout<<"Accout No. : "<<acc_no<<endl;
  cout<<"Name : "<<name<<endl;
  cout<<"Account Type : "<<acc_type<<endl;
  cout<<"Balance : "<<bal<<endl;
}
int main()
{
  int a_no;
  char nm[20],type[20];
  int b;
  cout<<"Enter Details:\n";
  cout<<"Account No.\n";
  cin>>a_no;
  cout<<"Name :\n";
  cin>>nm;
  cout<<"Account Type :\n";
  cin>>type;
  cout<<"Balance :\n";
  cin>>b;
  Bank obj(a_no,nm,type,b);//obj creation
  obj.deposit();
  obj.withdraw();
  obj.display();
}
  
  
  
  
      
  