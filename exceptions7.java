import java.util.*;
class NoMatchException extends Exception
{
	NoMatchException()
	{
		System.out.println("The String is not India");
	}
}

class Stringname
{
	public String s;
	
	Stringname(String a)
	{
		s=a;
	}
}
class exceptions7
{
	public static void main(String args[])
	{
		Stringname s1= new Stringname("Indiaa");
		try
		{
			if(s1.s=="India")
			{
				System.out.println("String is India");
			}
			else
			{
				throw new NoMatchException();
			}
		}
		
		catch(NoMatchException e)
		{
			System.out.println("e");
		}
	}
}