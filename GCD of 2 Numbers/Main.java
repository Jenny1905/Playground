import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
      int b=obj.nextInt();
      System.out.print("G.C.D of "+a+" and "+b+" is "+GCD(a,b));
    }
  public static int GCD(int a,int b)
  {
    if(b!=0)
      return GCD(b,a%b);
    else
  	  return a;
  }
}
    

  