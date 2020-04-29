import java.util.*;
class person
{
	private String name;
	private String address;
	private String email;
	private double phno;
	private int age;
	private Date DOB;
	
	public void getval()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the address");
		address=sc.nextLine();
		System.out.println("Enter the email");
		email=sc.nextLine();
		System.out.println("Enter the phone number");
		phno=sc.nextDouble();
		System.out.println("Enter the age");
		age=sc.nextInt();
		//System.out.println("Enter the DOB");
		//DOB=next Date();
		//DOB.getDate();
		
	}
	
	public void display()
	{
		System.out.println("Name"+ name);
		System.out.println("Address" + address);
		System.out.println("Email"+ email);
		System.out.println("Phone number" + phno);
		System.out.println("Age" + age);
		System.out.println("Date of Birth" + DOB);
	}
}

class student extends person
{
	private String course;
	private int PRN;
	
	
	public void getval1()
	{
		Scanner sc= new Scanner(System.in);
		super.getval();
		System.out.println("Enter the Course name");
		course=sc.nextLine();
		System.out.println("Enter the PRN");
		PRN=sc.nextInt();
	}
	
	public void display1()
	{
		super.display();
		System.out.println("Course::"+ course);
		System.out.println("PRN::" +PRN);
	}

}

class teacher extends person
{
	private String spec;
	private int empid;
	
	public void getval2()
	{
		Scanner sc= new Scanner(System.in);
		super.getval();
		System.out.println("Enter the Specialization");
		spec=sc.nextLine();
		System.out.println("Enter the Employee ID");
		empid=sc.nextInt();
	}

	public void display2()
	{
		super.display();
		System.out.println("Speciaization::"+spec);
		System.out.println("EMP ID::" + empid);
	}
}

class inheritence
{
	public static void main(String args[])
	{
		person p1 = new person();
		System.out.println("Person Object");
		p1.getval();
		p1.display();
		
		student s1= new student();
		System.out.println("Student Object");
		s1.getval1();
		s1.display1();
		
		teacher t1= new teacher();
		System.out.println("Teacher Object");
		t1.getval2();
		t1.display2();
	}
}

		
		