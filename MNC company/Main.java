#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
class Staff
{
    int staff_id;
    char name[20];
    float salary;
  public:
    Staff()
    {
    }
    void accept()
    {
        cout<<"Enter Staff Id : \n";
        cin>>staff_id;
        cout<<"Enter Staff Name : \n";
        cin>>name;
        cout<<"Enter Salary : \n";
        cin>>salary;
    }
    void display();
    friend void sort(char nm[],int  n,Staff *s);
  
};

void Staff :: display()
{
  	cout<<"Staff Id : "<<staff_id<<endl;
    cout<<"Name : "<<name<<endl;
    cout<<"Salary : "<<salary<<endl<<endl;
}
void sort(char nm[],int n,Staff  *s)
{
   Staff t;
   for(int i=0;i<n;i++)
   {
        for(int j=i+1;j<n;j++)
        {
            int x=strcmp(s[i].name,s[j].name);
            if(x>0)
            {
                t=s[i];
                s[i]=s[j];
                s[j]=t;
            }
        }
    }
}
int main()
{
   int choice,n;
   Staff *s;
   
   s=new Staff[n];
   cout<<"Enter No.of Records You Want :"<<endl;
   cin>>n;
   do
   {
        cout<<"1. Accept Data"<<endl;
        cout<<"2. Display Data"<<endl;
        cout<<"3. Sort Data by Name"<<endl;
        cout<<"4. Exit:"<<endl;
        cout<<"Enter Your Choice : "<<endl;
        cin>>choice;
        switch(choice)
        {
            case 1:
         	    for(int i=0;i<n;i++)
                {
              		cout<<"Enter Data for Employee "<<i+1<<endl;
              		s[i].accept();
                }
         	    break;
            case 2:
         	    for(int i=0;i<n;i++)
                {
              		s[i].display();
                }
         	    break;
            case 3:
         	    sort("a",n,s);
         	    cout<<"Data is Sorted!!!"<<endl<<endl;
         	    break;
            case 4:
         	    exit(0);
            default:
                cout<<"Invalid Choice!";	
        }
   }while(choice!=4);
   return 0;
 }
     
         
              

     

   
    
  

    
  
