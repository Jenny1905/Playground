import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
public static void main(String[] args) throws NumberFormatException, 
IOException {
Integer bread;
Float butter;
Float jam;
BufferedReader br = new BufferedReader(new 
InputStreamReader(System.in));
Calories ca = new Calories();
System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
System.out.println("Enter the choice");
Integer choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1 : System.out.println("Enter the number of Slice of bread");
bread = Integer.parseInt(br.readLine());
ca.calculateCalories(bread);
break;
case 2 : System.out.println("Enter the number of Slice of bread");
bread = Integer.parseInt(br.readLine());
System.out.println("Enter the number of teaspoon of Jam");
jam = Float.parseFloat(br.readLine());
ca.calculateCalories(bread,jam);
break;
case 3 : System.out.println("Enter the number of Slice of bread");
bread = Integer.parseInt(br.readLine());
System.out.println("Enter the number of teaspoon of Jam");
jam = Float.parseFloat(br.readLine());
System.out.println("Enter the number of teaspoon of Butter");
butter = Float.parseFloat(br.readLine());
ca.calculateCalories(bread,jam,butter);
}
System.out.printf("%.3f",ca.calculateEnergy());
System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
}
}
class Calories {
Float calories;
Float energy;
void calculateCalories(Integer bread)
{
calories = (float) (bread * 74);
}
void calculateCalories(Integer bread,Float jam)
{
calories = (bread * 74)+(jam * 26);
}
void calculateCalories(Integer bread,Float jam,Float butter)
{
calories = (bread * 74)+(jam * 26)+(butter * 102);
}
float returnCalories()
{
return calories;
}
float calculateEnergy()
{
return energy = (float) (calories * 4.1868);
}
}