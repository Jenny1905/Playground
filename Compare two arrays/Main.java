import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    int s1=0,s2=0;
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
      s1=s1+a[i];
    }
    for(int i=0;i<n;i++)
    {
      b[i]=obj.nextInt();
      s2=s2+b[i];
    }
    if(s1==s2)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}

  