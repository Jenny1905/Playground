import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
public static void main(String[] arg)throws IOException,NumberFormatException
{
String name;
String address;
String contactNumber;
String email;
String proofType;
String proofId;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Registration");
System.out.println("Enter your name");
name=br.readLine();
System.out.println("Enter your address");
address=br.readLine();
System.out.println("Contact Number");
contactNumber=br.readLine();
System.out.println("E-Mail ID");
email=br.readLine();
System.out.println("Enter proof type");
proofType=br.readLine();
System.out.println("Enter proof id");
proofId=br.readLine();
Customer customer =new Customer();
customer.setName(name);
customer.setAddress(address);
customer.setContactNumber(contactNumber);
customer.setEmail(email);
customer.setProofType(proofType);
customer.setProofId(proofId);
customer.display();
}
}
class Customer
{
private String name;
private String address;
private String contactNumber;
private String email;
private String proofType;
private String proofId;

public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public String getAddress()
{
return address;
}
public void setAddress(String address)
{
this.address=address;
}
public String getContactNumber()
{
return contactNumber;
}
public void setContactNumber(String contactNumber)
{
this.contactNumber=contactNumber;
}
public String getEmail()
{
return email;
}
public void setEmail(String email)
{
this.email=email;
}
public String getProofType()
{
return proofType;
}
public void setProofType(String proofType)
{
this.proofType=proofType;
}
public String getProofId()
{
return proofId;
}
public void setProofId(String proofId)
{
this.proofId=proofId;
}

void display()
{
System.out.println("Customer Details");
System.out.println(this.getName());

System.out.println(this.getAddress());

System.out.println(this.getContactNumber());

System.out.println(this.getEmail());

System.out.println(this.getProofType());

System.out.println(this.getProofId());
System.out.println("Thank you for registering. Your id is 1...");
}
}