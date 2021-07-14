import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;
class Card
{
private int v;
private char k;
public Card()
{
this.v=0;
this.k='k';
}
public void setName(Character d)
{
this.k=d;
}
public void setValue(int l)
{
this.v=l;
}
public int getValue()
{
return v;
}
public Character getName()
{
return k;
}
}
public class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Set<Card> lh=new LinkedHashSet<Card>();
int val,count=0,n=0,j=0,cnt=0;
char sym,a;
//n=s.nextInt();
boolean res=true;
Card[] cd=new Card[100];
ArrayList<Character> ll=new ArrayList<Character>();


while(res)
{
if(ll.size()==4)
break;
else
{
sym=s.next().charAt(0);
if(!ll.contains(sym))
{

ll.add(sym);
val=s.nextInt();
cd[j]=new Card();
cd[j].setName(sym);
cd[j].setValue(val);
count++;
lh.add(cd[j]);
}
else
{
//sym=s.next().charAt(0);
val=s.nextInt();
cd[j]=new Card();
cd[j].setName(sym);
cd[j].setValue(val);
count++;
lh.add(cd[j]);
}
}
j++;
}
ArrayList<Character> al=new ArrayList<Character>();

ArrayList<Character> al2=new ArrayList<Character>();
for(int i=0;i<count;i++)
{
a=cd[i].getName();
if(!al2.contains(a))
al2.add(a);
}
Collections.sort(al2);

LinkedList<Card> al3=new LinkedList<Card>();
for(Character a1:al2)
{
cnt=0;
for(Card c:lh)
{
sym=c.getName();
if(sym==a1)
{
al3.add(c);
cnt=1;
}
if(cnt==1)
break;
}
}
Iterator<Card> itr=al3.iterator();
System.out.println("Four symbols gathered in "+count+" cards.\nCards in Set are :");
while(itr.hasNext())
{
Card c=(Card)itr.next();
System.out.println(c.getName()+" "+c.getValue());

}
}
}