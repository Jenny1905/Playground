import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
        sum=sum+a[i];
    }
    System.out.print("The sum of the even numbers in the array is " + sum );
  }
}

  