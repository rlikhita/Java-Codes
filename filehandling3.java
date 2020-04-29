import java.io.*;
import java.util.*;
class filehandling3
{
	public static void main(String args[]) throws IOException
	{
		FileWriter f1 = new FileWriter ("MyFile1.text",true);
		String ch=" ";
		int a;	
		while(!(ch.equals("0")))
		{
			
			System.out.print("Please enter 1 to continue::");
				Scanner sc= new Scanner(System.in);
				a=sc.nextInt();
			if(a==1)
			{ 
				Scanner ac= new Scanner(System.in);
				ch=ac.next();
				f1.write(ch);
				f1.write("\n");
			}
			else
			{
				
				f1.close();
				break;
			}
		}
	}
}