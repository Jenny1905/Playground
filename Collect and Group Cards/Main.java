import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
class Card
{
private char name;
private int val;
public void setName(char n)
{
this.name=n;
}
public void setValue(int v)
{
this.val=v;
}
public int getVal()
{
return val;
}
public char getName()
{
return name;
}
}
public class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Map<Integer,Card> lh=new LinkedHashMap<Integer,Card>();
int n=s.nextInt();
Card[] cd=new Card[n];
int num,k,count=0,sum=0;
char sym,ch;
for(int i=0;i<n;i++)
{
sym=s.next().charAt(0);
num=s.nextInt();
cd[i]=new Card();
cd[i].setName(sym);
cd[i].setValue(num);
lh.put(i,cd[i]);
}
ArrayList<Character> al=new ArrayList<Character>();
for(Map.Entry<Integer,Card> entry:lh.entrySet())
{
Card c=entry.getValue();
ch=c.getName();
if(!al.contains(ch))
al.add(ch);
}
System.out.println("Distinct Symbols are :");
Collections.sort(al);
for(Character a:al)
System.out.print(a+" ");
for(Character a:al)
{
System.out.println("\nCards in "+a+" Symbol");
for(Map.Entry<Integer,Card> ent:lh.entrySet())
{
Card d=ent.getValue();
ch=d.getName();
k=d.getVal();
if(ch==a)
{
System.out.println(a+" "+k);
count++;
sum=sum+k;
}
}
System.out.println("Number of cards : "+count);
System.out.println("Sum of Numbers : "+sum);
count=0;
sum=0;

}


}
}