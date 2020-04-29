class person
{
	protected String name;
	
	person()
	{
		name="Likhita";
	}
	
	person(String a)
	{
		name=a;
	}
	
}

class student extends person
{
	private int rollno;
	private String course;
	
	student()
	{
		rollno=31;
		course="MBA";
	}
	
	student(int a, String b)
	{
		rollno=a;
		course=b;
	}
	
	public void display()
	{
		System.out.println("Name"+name);
		System.out.println("Roll No"+ rollno);
		System.out.println("Course" + course);
		//System.out.println("Branch::"+ branch);
	}
}

class graduate extends student
{
	private String branch;
	
	graduate()
	{
		branch="IT";
	}
	
	graduate(String a)
	{
		branch=a;
	}
	
	public void display1()
	{
		System.out.println("******Graduate Class******");
		display();
		
		System.out.println("Branch::"+ branch);
	}
	
}

class PostGraduate extends student
{
	private String Pbranch;
	private char grade;
	
	PostGraduate()
	{
		super();
		Pbranch="MSC";
		grade='A';
	}
	
	PostGraduate(int a,String b,String c,char d)
	{
		super(a,b);
		Pbranch=c;
		grade=d;
	}
	
	public void display2()
	{
		System.out.println("******Post Gradute  Class******");
		display();
		System.out.println("Pbranch::" + Pbranch);
		System.out.println("Grade::"+ grade);
	}
	
}

class teacher extends person
{
	private String Qualification;
	private String Designation;
	
	teacher()
	{
		super();
		Qualification="PhD";
		Designation="Proffessor";
	}
	
	teacher(String a, String b,String c)
	{
		super(a);
		Qualification=b;
		Designation=c;
	}
	
	public void display3()
	{
		//display();
		System.out.println("******Teacher Class******");
		System.out.println("Qualification::"+Qualification);
		System.out.println("Designation::"+Designation);
	}
	
	public void setQualification()
	{
		if (Qualification=="PhD")
		{
			Designation="Proffessor";
		}
		else
		{
			Designation="Assisstant Proffessor";
		}
	}
	
	public void promote()
	{
		System.out.println("He is promoted!!");
	
	}
}

class college1
{
	public static void main(String args[])
	{
		student s1= new student();
		s1.display();
		//s1.display2();
		
		 graduate g1 = new graduate();
		g1.display1();
		
		PostGraduate p1 = new PostGraduate();
		p1.display2();
		
		teacher t1= new teacher();
		t1.setQualification();
		t1.display3();
		t1.promote();
	}
}
		
		
		
