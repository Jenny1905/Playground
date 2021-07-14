import java.util.*;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=obj.nextInt();
      }
      System.out.println("Maximum element in the array is "+ maxElem(a,a.length-1));
    }
  public static int maxElem(int a[],int index)
  {
    if(index>0)
      return Math.max(a[index],maxElem(a,index-1));
    else
      return a[0];
  }
}
      

    
