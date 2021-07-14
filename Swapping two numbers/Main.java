import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
      int b=obj.nextInt();
      int temp=a;//10
      a=b;//20
      b=temp;//10
      System.out.println(a);
      System.out.println(b);

    }
}