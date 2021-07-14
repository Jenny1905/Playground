import java.util.Scanner;
import java.util.LinkedList;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
LinkedList <String> ar=new LinkedList <String>();

for(int i=0;i<a;i++)
{
String b=sc.next();
ar.add(b);
}
System.out.println("Actual LinkedList:"+ar);
ar.clear();
System.out.println("After clear LinkedList:"+ar);
}
}