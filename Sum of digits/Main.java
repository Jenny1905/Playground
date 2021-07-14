import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      System.out.print("The sum of digits in "+n+" is "+sod(n));
    }
  public static int sod(int n)
  {
    int sum=0;
    sum=n%10;
    if(n==0)
      return 0;
    else
      return sum+sod(n/10);
  }
}

   