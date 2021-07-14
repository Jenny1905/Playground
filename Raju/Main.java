import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class Main
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
LinkedList<String> a=new LinkedList<String>();
int n,i;
n=sc.nextInt();
//sc.nextLine();
for(i=1;i<=n;i++)
{
String str=sc.next();
a.add(str);
}
Iterator<String> it=a.iterator();
while(it.hasNext())
{
System.out.print(it.next()+"\n");
}
}
}