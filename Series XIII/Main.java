import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a=5;
      int x=1;
      for(int i=1;i<=n;i++)
      {
        System.out.print(a+ " ");
        a=a+(11*x);
        x=x+2;
      }
    }
}

    