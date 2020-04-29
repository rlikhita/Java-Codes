import java.util.*;
abstract class person
{
	private String name;
	private String Address;
	private double phno;
	private String email;
	
	person()
	{
		name="XYZ";
		Address="PQR";
		phno=4566987;
		email="likhitareddy17@gmail.com"
	}
	
	person(String a,String b,double c,String Email)
	{
		this.name=a;
		this.Address=b;
		this.phno=c;
		this.email=d;
	}
	
	/*void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter Address");
		Address=sc.nextLine();
		System.out.println("Enter Phone number");
		phno=sc.nextDouble();
		System.out.println("Enter Email");
		email=sc.next();
	}*/

	void display()
	{
		System.out.println("Name::"+ name);
		System.out.println("Address::"+ Address);
		System.out.println("Phone number::"+ phno);
		System.out.println("Email::"+ email);
	}
}

class student extends person
{
	private String status;
	private int class1;
	private int YearOfAdmission;
	
	student()
	{
		super();
		status="FRESHER";
		class1=2;
		YearOfAdmission=1;
	}
	
	student(String name,
	{
	}
	
	student(String status,
	{
		super();
	}
	
	

	/*void accept1()
	{
		accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter class");
		class1 = sc.nextInt();
		System.out.println("Enter year of Admission");
		YearOfAdmission =sc.nextInt();		
	}
	
	void status()
	{
			if(YearOfAdmission==1)
			{
				status="FRESHER";
			}
			else if (YearOfAdmission==2)
			{
				status="JUNIOR";
			}
			else
			{
				status="SENIOR";
			}
	}*/
	void display()
	{
		super.display();
		System.out.println("Status::" + status);
		System.out.println("Class::" + class1);
		System.out.println("Year Of Admission::"+ YearOfAdmission);
		
	}
	
}

abstract class faculty extends person
{
	private String OfficeName;
	private int empid;
	protected double sal;
	
	faculty()
	{
		super();
		OfficeName="Proffessor";
		empid=1234;
		sal=10000;
	}
	
	faculty(String a, Stirng b,double phno,String email,String Officename, int empid)
	{
		super(name, Address,phno,email);
		this.OfficeName=a;
		this.empid=b;
		
	}
		
	
	/*void accept2()
	{
		accept();	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Office Name");
		OfficeName=sc.next();
		System.out.print("Enter the Salary");
		sal=sc.nextInt();
		
	}*/
	
	void display()
	{
		super.display();
		System.out.print("Office Name::" + OfficeName);
		System.out.print("Salary::" + sal);
	}
		
	
	abstract void calsal();
	
	
}
class visiting extends faculty
{
	private int no_of_hr;
	private float payment;
	
	visiting(Sring name,String Address,double phno,String email,String OfficeName,int Empid, double sal, int no-of-hr,float payment)
	{
		super(name,Address,phno,email,officeName,Empid,sal);
		this.no-of-hr=no_of_hr;
		this.payment=payment;
	}

	public void calsal()
	{
		
		sal=no_of_hr*payment;

		
class inhericon
{
	public static void main(String args[])
	{
		
		student obj1=new student();
		//obj1.accept1();
		obj1.status();
		obj1.display1();
		
		faculty obj2=new faculty();
		//obj2.accept2();
		obj2.display2();
		
		visiting f1=new visiting();
		faculty f2=new visiting(...);
		person f3=new visiting(....);
		
		
	}
}
	
	