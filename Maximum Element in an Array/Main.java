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
      int max=a[0];
      for(int i=0;i<n;i++)
      {
        if(a[i]>max)
          max=a[i];
      }
      System.out.print(max+" is the maximum element in the array ");
    }
}

    