import java.util.Scanner;
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
      System.out.print("The sum of the elements in the array is "+soa(a,n));
    }
      public static int soa(int a[],int n)
      {
        if(n<=0)
          return 0;
        else
          return (soa(a,n-1)+a[n-1]);
      }
    }

    