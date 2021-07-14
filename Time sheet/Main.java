#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thur,fri,sat;
  int rate1,rate2,rate3,rate4,rate5,rate6,
    rate7,rate8=0,bonus,bs,total_days,edays;
  cin>>sun>>mon>>tue>>wed>>thur>>fri>>sat;
  rate1=sun*150;
  rate7=sat*125;
  if(mon<=8)
  {
    rate2=mon*100;
  }
  else if(mon>8)
  {
    bonus=mon-8;
    bs=bonus*115;
    rate2=bs+800;
  }
  if(tue<=8)
  {
    rate3=tue*100;
  }
  else if(tue>8)
  {
    bonus=tue-8;
    bs=bonus*115;
    rate3=bs+800;
  }
  if(wed<=8)
  {
    rate4=wed*100;
  }
  else if(wed>8)
  {
    bonus=wed-8;
    bs=bonus*115;
    rate4=bs+800;
  
  }
  if(thur<=8)
  {
    rate5=thur*100;
  }
  else if(thur>8)
  {
    bonus=thur-8;
    bs=bonus*115;
    rate5=bs+800;
  }
  if(fri<=8)
  {
    rate6=fri*100;
  }
  else if(fri>8)
  {
    bonus=fri-8;
    bs=bonus*115;
    rate6=bs+800;
  }
  total_days=mon+tue+wed+thur+fri;
  if(total_days>40)
  {
    edays=total_days-40;
    rate8=edays*25;
  }
  int salary=rate1+rate2+rate3+rate4+rate5+rate6+
    rate7+rate8;
  cout<<salary;
}
    
