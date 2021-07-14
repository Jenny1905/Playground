import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a[][]=new int[n][n];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          a[i][j]=obj.nextInt();
        }
      }
      int flag=1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i!=j)
          {
            if(a[i][j]!=0)
              flag=0;
          }
        }
      }
      if(flag==1)
        System.out.print("yes");
      else
        System.out.print("no");

      
	}
}