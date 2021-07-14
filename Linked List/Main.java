import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
LinkedList<String> ll=new LinkedList<String>();
int n=s.nextInt();
s.nextLine();
String k;
for(int i=0;i<n;i++)
{
k=s.nextLine();
ll.add(k);
}
int n1=s.nextInt();
s.nextLine();
ArrayList<String> al=new ArrayList<String>(ll);
for(int i=0;i<n1;i++)
{
k=s.nextLine();
al.add(k);
}
System.out.println("Actual LinkedList:"+ll);
System.out.println("After Copy:"+al);
}
}