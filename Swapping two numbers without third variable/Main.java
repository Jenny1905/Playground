import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
      int b=obj.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a);
      System.out.println(b);


    }
}