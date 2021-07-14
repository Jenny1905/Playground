import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a=0,b=1,c,count=0;
      for(int i=1;i<=n;i++)
      {
        count=count+1;
        if(count==n)
          System.out.print(a);
        c=a+b;
        a=b;
        b=c;
      }
    }
}
        

   