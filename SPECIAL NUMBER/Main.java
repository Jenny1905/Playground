import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int sum=0,product=0;
      int m=obj.nextInt();
      int n=obj.nextInt();
      for(int i=m;i<=n;i++)
      {
        sum=(i%10)+(i/10);
        product=(i%10)*(i/10);
        if(i==(sum+product))
          System.out.println(i);
      }
    }
}

    