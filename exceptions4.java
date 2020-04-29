import java.util.*;
public class exceptions4
 {
   public static void main(String[] args) 
   {
      System.out.println("**Calculator**");
		try
		{
			String numb1,numb2,operator;
			Scanner sc= new Scanner(System.in);			
			System.out.println("Input the first number");
			numb1=sc.next();
			int number1 = Integer.parseInt(numb1);
			System.out.println("Input the second number");
			numb2=sc.next();
			int number2 = Integer.parseInt(numb2);
			System.out.println("Enter the option as to which operation has to be performed");
			operator=sc.next();			
			int operation= Integer.parseInt(operator);
			if(operation==1)
			{
				System.out.println("Addition::"+ (number1+number2));
			}
			else if(operation==2)
			{
				System.out.println("Substraction::"+ (number1-number2));
			}
			else if(operation==3)
			{
				System.out.println("Multiplication::"+ (number1*number2));
			}
			else if(operation==4)
			{
				System.out.println("Division::"+ (number1/number2));
			}
			else
			{
				System.out.println("Select a valid option");
			}
		}
		
		
		catch(NumberFormatException f)
		{
			System.out.println("***PLEASE ENTER A NUMBER***");
		}
   }
}