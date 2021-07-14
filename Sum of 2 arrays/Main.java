import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=obj.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        b[i]=obj.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        int sum=a[i]+b[i];
      System.out.println(sum);
      }

    }
}