import java.util.*;
class AgeNotWithinRangeException extends Exception
{
	AgeNotWithinRangeException()
	{
		System.out.println("YOU HAVE NOT ENTERED A VALID AGE");
	}
}

class NameNotValidException extends Exception
{
	NameNotValidException()
	{
		System.out.println("PLEASE ENTER NAME CORRECTLY");
	}
}
class student
{
	private int rollno;
	public String name;
	public int age;
	private String course;
	
	student(int a,String b,int c,String d)
	{
		rollno=a;
		name=b;
		age=c;
		course=d;
	}
	
	
}

class exceptions5
{
	public static void main(String args[])
	{
		student s1= new student(1,"Likhita",88,"MBA");
	
	try
	{
		if((s1.age<15) || (s1.age>21))
		{
			throw new AgeNotWithinRangeException();
		}
		else
		{
			System.out.println("The age is right");
		}
	}
		
	catch(AgeNotWithinRangeException e)
	{
		e.printStackTrace();
	}
	
	try
	{
		if((s1.name).isNumber())
		{
			throw new NameNotValidException();
		}
		else
		{
			System.out.println("The name is correct");
		}
	}
	
	catch(NameNotValidException f)
	{
		System.out.println(f);
	}
	}
}