import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      boolean isUpper=true;
      Scanner obj=new Scanner(System.in);
      int row=obj.nextInt();
      int col=obj.nextInt();
      int a[][]=new int[row][col];
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
          a[i][j]=obj.nextInt();
        }
      }
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<i;j++)
        {
          if(a[i][j]!=0)
          {
            isUpper=false;
            break;
          }
        }
        if(!isUpper)
        {
          break;
        }
      }
      if(isUpper)
        System.out.print("yes");
      else
        System.out.print("no");
    }
 
      

    }
