import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
      int score=obj.nextInt();
      if(score==100)
      {
        System.out.println("S");
      }
      else if(score>=90 && score<=99)
      {
                System.out.println("A");
      }
      else if(score>=80 && score<=89)
      {
                System.out.println("B");
      }
      else if(score>=70 && score<=79)
      {
                System.out.println("C");
      }
      else if(score>=60 && score<=69)
      {
                System.out.println("D");
      }
      else if(score>=50 && score<=59)
      {
                System.out.println("E");
      }
      else
      {
                        System.out.println("F");
      }

        

    }
}