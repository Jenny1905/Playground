#include<iostream>
using namespace std;
int main()
{
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  struct grade
  {
    int rn;
    int s[5];
    float avg;
    int grade;
  };
  int x;
 
  cin>>x;//no of students
  struct  grade s1[x];
  for(int k=0;k<x;k++)
  {
    int sum1=0;
    float avg=0;
    cin>>s1[k].rn;
    cout<<s1[k].rn<<" ";
    for(int i=0;i<5;i++)
    {
      cin>>s1[k].s[i];
      cout<<s1[k].s[i]<<" ";
    }
  
  for(int i=0;i<5;i++)
  {
    sum1=sum1+s1[k].s[i];
  }
  avg=sum1/5;
  cout<<avg<<" ";
  if(avg>70)
  {
    cout<<"1";
  }
  else if(avg>=50 && avg<=70)
  {
    cout<<"2";
  }
  else
  {
    cout<<"3";
  }
  cout<<endl;
}
}
  

  
    
    
    