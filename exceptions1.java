import java.util.*;
class odd1 extends Exception
{
	odd1()
	{
		System.out.println("You have entered odd number");
	}
}

class exceptions1
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
		try
		{
		
			if((num%2)!=0) 
			{
				throw new odd1();
			}
			else
			{
				System.out.println("It is even no");
			}
		}
		
		catch(odd1 e)
		{
			System.out.print("Number is odd\n");
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Number=  "+num);
		}
		
	}
}