import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a=0,b=0,c=1;
      for(int i=1;i<=n;i++)
      {
        System.out.print(a);
        int d=a+b+c;
        a=b;
        b=c;
        c=d;
        System.out.print(" ");
      }
    }
}

    