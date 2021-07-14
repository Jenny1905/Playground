import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      b[i]=obj.nextInt();
    }
    int flag=1;
    for(int i=0;i<n;i++)
    {
      if(a[i]<b[i])
        flag=0;
    }
    if(flag==1)
      System.out.print("Compatible");
    else
      System.out.print("Incompatible");
  }
}
  