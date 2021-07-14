import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    StringBuffer sb=new StringBuffer();
    String s=obj.nextLine();
    String h=obj.nextLine();
    if(s.contentEquals(h))
    {
      System.out.print("Equal");
    }
    else
    {
      System.out.print("Not equal");
    }
  }
}

 
  