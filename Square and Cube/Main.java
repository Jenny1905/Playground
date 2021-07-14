#include<iostream>
using namespace std;
class Square
{
  public:
  int printSquare(int n)
  {
    int sq;
    sq=n*n;
    return sq;
  }
};
class Cube
{
  public:
  int printCube(int n)
  {
    int cube;
    cube=n*n*n;
    return cube;
  }
};
int main()
{
  Square s;
  Cube c;
  int sq,cube;
  int x,y;
  cin>>x>>y;
  cout<<"Enter an integer number: ";
  
cout<<"Square of "<<x<<" is: "<<s.printSquare(x)<<endl;
  cout<<"Enter an integer number: ";
  
cout<<"Cube of "<<y<<" is: "<<c.printCube(y);;
  return 0;
}
  