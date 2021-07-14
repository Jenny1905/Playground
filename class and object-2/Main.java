import java.util.*; 
class Customer 
{ 
String name; 
String address; 
String contactNumber; 
String email; 
String proofType; 
String proofID; 
int ncount=0,x=1; 
void Register(String name,String address,String contactNumber,String 
email,String proofType,String proofID) 
{ 
int i,ncheck=0,adcheck=0,check=0,echeck=0,ptcheck=0,pidcheck=0; 
for(i=0;i<name.length();i++) 
{ 
if(Character.isLetter(name.charAt(i))) 
ncheck++; 
} 
for(i=0;i<address.length();i++) 
{ 
if((Character.isLetter(address.charAt(i)))||(Character.isDigit(address.charAt(i)))||(address.charAt(i)=='-')) 
adcheck++; 
} 
for(i=0;i<contactNumber.length();i++) 
{ 
if(Character.isDigit(contactNumber.charAt(i))) 
check++; 
} 
for(i=0;i<email.length();i++) 
{ 
if((email.charAt(i)=='@')||(email.charAt(i)=='.')) 
echeck++; 
} 
for(i=0;i<proofType.length();i++) 
{ 
if(Character.isLetter(proofType.charAt(i))) 
ptcheck++; 
} 
for(i=0;i<proofID.length();i++) 
{ 
if((Character.isLetter(proofID.charAt(i)))||(Character.isDigit(proofID.charAt(i)))) 
pidcheck++; 
} 
if(ncheck!=name.length()) 
System.out.println("Invalid Name\nRegistration Failed"); 
else if(adcheck!=address.length()) 
System.out.println("Invalid Address\nRegistration Failed"); 
else if(check!=contactNumber.length()) 
System.out.println("Invalid Contact Number\nRegistration Failed"); 
else if(echeck!=2) 
System.out.println("Invalid Email\nRegistration Failed"); 
else if(ptcheck!=proofType.length()) 
System.out.println("Invalid ProofType\nRegistration Failed"); 
else if(pidcheck!=proofID.length()) 
System.out.println("Invalid ProofId\nRegistration Failed"); 
else{ 
System.out.println("Registration Successfull\nYour Details:\n"+name+"\n"+address+"\n"+contactNumber+"\n"+email+"\n"+proofType+"\n"+proofID+"\nYour id is "+x); 
x++; 
} 
} 
} 
class Main extends Customer{ 
public static void main (String[] args) { 
Scanner s=new Scanner(System.in); 
Main ob=new Main(); 
System.out.println("Enter the number of Customer"); 
int x=s.nextInt(); 
int k=0; 
while(k<x){ 
System.out.println("Enter the name"); 
ob.name=s.next(); 
System.out.println("Enter the address"); 
ob.address=s.next(); 
System.out.println("Enter the contact number"); 
ob.contactNumber=s.next(); 
System.out.println("Enter the email"); 
ob.email=s.next(); 
System.out.println("Enter the ProofType"); 
ob.proofType=s.next(); 
System.out.println("Enter the proof ID"); 
ob.proofID=s.next(); 
ob.Register(ob.name,ob.address,ob.contactNumber,ob.email,ob.proofType,ob.proofID); 
k++; 
} 
} 
}