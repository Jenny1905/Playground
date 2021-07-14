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
for(i=1;i<=n;i++)
{
String str=sc.next();
a.add(str);
}
LinkedList<String> a1=(LinkedList<String>)a.clone();
System.out.println("Actual LinkedList:");
Iterator<String> it=a.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
System.out.println("Cloned LinkedList:");
Iterator<String> it1=a1.iterator();
while(it1.hasNext())
{
System.out.println(it1.next());
}

}
}