import java.util.Scanner;
class Student implements Cloneable
{
private String name;
private int id;
private Department department;
public void Student(int id,String name,Department department)
{
this.name=name;
this.id=id;
this.department=department;
System.out.println("Id: "+id);
System.out.println("Name: "+name);
System.out.println("Department Id: "+department.getId());
System.out.println("Department:"+department.getName());
}
public Object clone() throws CloneNotSupportedException
{
return super.clone();
}
//Department department=new Department(id,department);
}
class Department extends Student
{
private String name;
private int id;

public String getName()
{
return name;
}
public void setName(String name1)
{
this.name=name1;
}

public int getId()
{
return id;
}
public void setId(int id1)
{
this.id=id1;
}

public void Department(int id,String name)
{
this.id=id;
this.name=name;
}
/*Department(Department oldDepartment)
{
setDepartment(oldDepartment);
}*/
}
class Main extends Department
{
public static void main (String[] args)
{
try{
Scanner in=new Scanner(System.in);
Main ob1=new Main();
System.out.println("Name");
String name=in.nextLine();
ob1.setName(name);
System.out.println("Id");
int id=in.nextInt();
ob1.setId(id);
System.out.println("Department");
String dept=in.next();
Department department=new Department();
department.Department(id,dept);
Student originalemployee=new Student();
System.out.println("Original:-");
originalemployee.Student(id,name,department);
Student clonedEmployee=(Student)originalemployee.clone();
System.out.println("Duplicate:-");
clonedEmployee.Student(id,name,department);
}
catch(Exception e)
{

}
}
}