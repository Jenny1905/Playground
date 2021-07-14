import java.util.Scanner;
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str =s.next();
TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
int n=str.length();
for(int i=0;i<n;i++)
{
char c=str.charAt(i);
Integer val=map.get(c);
if(val!=null)
{
map.put(c,new Integer(val+1));
}
else
{
map.put(c,1);
}
}
System.out.println("Character frequency in given text:");
for(Map.Entry<Character,Integer>entry: map.entrySet())
{
System.out.print(entry.getKey() +":"+entry.getValue()+" ");
}
}
}