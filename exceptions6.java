import java.util.*;
class internal extends Exception
{
	internal()
	{
		System.out.println("Internal Marks is exceed");
	}
}

class external extends Exception
{
	external()
	{
		System.out.println("External Marks is exceed");
	}
}

class marks
{
	public int internal,external;
	
	marks(int a, int b)
	{
		internal=a;
		external=b;
	}
	
	
}
class exceptions6
{
	public static void main(String args[])
	{
		marks m1= new marks(45,80);
		try
	{
		if(m1.internal > 40)
		{
			throw new internal();
		}
	}
	
	
	catch (internal a)
	{
		a.printStackTrace();
	}
	
	try{
		
		 if( m1.external > 60)
		{
			throw new external();
		}
		else
		{
			System.out.println("Everything is fine");
		}
	}
	catch (external b)
	{
		b.printStackTrace();
	}
	}
}