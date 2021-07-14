import java.util.Scanner;
class Shape
{
 static int length;
 static int breadth;
 static int height;
 static int radius;
 void Shape(){
 }
 public int calculateAreaOfCube()
 {
 return (length*breadth*height);
 }
 public float calculateAreaOfSphere()
 {
 return (float)(((float)(4.0/3.0))*(3.14)*(Math.pow(radius,3)));
 }
 public float calculateAreaOfCylinder()
 {
 return (float)((3.14)*(Math.pow(radius,2))*height);
 }
 void Shape(int length,int breadth,int height)
 {
 length=length;
 breadth=breadth;
 height=height;
 System.out.println("Area of Cube is "+calculateAreaOfCube());
 }
 void Shape(int radius)
 {
 radius=radius;
 System.out.printf("Area of Sphere is %.2f",calculateAreaOfSphere());
 }
void Shape(int radius,int height)
 {
 radius=radius;
 height=height;
 System.out.println("Area of Cylinders is "+calculateAreaOfCylinder());
 }
 
}
class Main extends Shape
{
 
 public static void main (String[] args) {
 Scanner s=new Scanner(System.in);
 Main obj=new Main();
 Shape ob=new Shape();
 System.out.println("1.Cube\n2.Sphere\n3.Cylinder");
 System.out.println("Enter the choice");
 int x=s.nextInt();
 if(x==1)
 {
 System.out.println("length");
 length=s.nextInt();
 System.out.println("breadth");
 breadth=s.nextInt();
 System.out.println("height");
 height=s.nextInt();
 ob.Shape(length,breadth,height);
 }
 else if(x==2)
 {
 System.out.println("radius");
 radius=s.nextInt();
 ob.Shape(radius);
 }
 else if(x==3)
 {
 System.out.println("radius");
 radius=s.nextInt();
 System.out.println("height");
 height=s.nextInt();
 ob.Shape(radius,height);
 }
 }
}