import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<String> a=new ArrayList<String>();
a.add(sc.nextLine());
System.out.println("Actual ArrayList:"+a);
a.removeAll(a);
System.out.println("After clear ArrayList:"+a);
}
}