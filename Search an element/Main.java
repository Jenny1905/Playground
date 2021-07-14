import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();//total no.of element
      int a[]=new int[n];//array initialization
      for(int i=0;i<n;i++)
      {
        a[i]=obj.nextInt();//entering the array elements
      }
      int s=obj.nextInt();//search element
      int flag=0;//false
      for(int i=0;i<n;i++)
      {
        if(s==a[i])//present or not
          flag=1;//true
      }
      if(flag==1)
        System.out.print(s + " is present in the array ");
      else
        System.out.print(s+ " is not present in the array ");
    }
}

    