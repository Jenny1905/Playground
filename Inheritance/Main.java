import java.util.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Name");
    String name=obj.next();
    System.out.println("Age");
    int age=obj.nextInt();
    System.out.println("Gender");
    char gender=obj.next().charAt(0);
    System.out.println("ID Number");
    long idno=obj.nextLong();
    System.out.println("Major");
    String major=obj.next();
    System.out.println("CGPA");
    double cgpa=obj.nextDouble();
    System.out.println("Year");
    int year=obj.nextInt();
    CollegeStudent cs=new CollegeStudent(name,age,gender,idno,cgpa,major,year);
    System.out.println("The Student details is");
    cs.toString();
    System.out.println(cs);
  }
}
class Student
{
  private String name;
  private int age;
  private char gender;
  private long idno;
  private double cgpa;
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public int getAge()
  {
    return age;
  }
  public void setAge(int age)
  {
    this.age=age;
  }
  public char getGender()
  {
    return gender;
  }
  public void setGender(char gender)
  {
    this.gender=gender;
  }
  public long getIdNo()
  {
    return idno;
  }
  public void setIdNo(long idno)
  {
    this.idno=idno;
  }
  public double getCgpa()
  {
    return cgpa;
  }
  public void setCgpa(double cgpa)
  {
    this.cgpa=cgpa;
  }
  public Student(String name,int age,char gender,long idno,double cgpa)
  {
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.idno=idno;
    this.cgpa=cgpa;
  }
}
class CollegeStudent extends Student
{
private String major;
private int year;
public String getMajor()
{
return major;
}
public void setMajor(String major)
{
this.major=major;
}
public int getYear()
{
return year;
}
public void setYear(int year)
{
this.year=year;
}
public CollegeStudent(String myName,int myAge,char myGender,long myIdNo,double myCgpa,String major,int year)
{
super(myName,myAge,myGender,myIdNo,myCgpa);
this.major=major;
this.year=year;
}
 public String toString() 
 {
    return "ID : "+getIdNo()+"\nName : "+getName()+"\nAge : "+getAge()+"\nGender : "+getGender()+"\nMajor : "+getMajor()+"\nCGPA : "+getCgpa()+"\nYear : "+getYear(); 
    }
    }
