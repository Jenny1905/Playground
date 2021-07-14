import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
      int x=obj.nextInt();
      int y=obj.nextInt();
      if(x>y)
      {
        System.out.println(x + " greater than "+y);
      }
      else if(x<y)
      {
         System.out.println(x + " less than "+y);
      }
      else
      {
          System.out.println(x +" and "+y+ " are equal");

      }
    }
}