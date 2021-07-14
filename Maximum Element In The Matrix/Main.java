import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int r=obj.nextInt();
      int c=obj.nextInt();
      int a[][]=new int[r][c];
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          a[i][j]=obj.nextInt();
        }
      }
      int max=a[0][0];
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
            if(a[i][j]>max)
              max=a[i][j];
          }
      }
      System.out.print(max);
      

        

    }
}