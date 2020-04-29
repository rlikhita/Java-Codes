import java.io.*;
import java.util.*;
class filehandling5
{
	public static void main(String args[]) throws IOException
	{
		File f1= new File("MyFile1.text");
		if(f1.exists())
		{
			int cnt=0;
			Scanner sc= new Scanner(f1);
			while(sc.hasNextLine())
			{
				String data= sc.nextLine();
				System.out.println(data);
				cnt++;
			}
			
			System.out.println("The total number of lines is  "+ cnt);
		}
		else
		{
			System.out.println("FIle does not exists");
		}
	}
}