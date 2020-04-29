import java.util.*;
class multiply5 extends Exception
{
	multiply5()
	{
		System.out.println("You have entered number which is divisible by 5");
	}
}

class exceptions2
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
		try
		{
		
			if((num%5)==0) 
			{
				throw new multiply5();
			}
			else
			{
				System.out.println("It is not divisible by 5");
			}
		}
		
		catch(multiply5 e)
		{
			System.out.print("Number is divisible by 5\n");
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Number=  "+num);
		}
		
	}
}