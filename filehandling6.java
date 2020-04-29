import java.io.*;
import java.util.*;
class filehandling5
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream f2= new FileInputStream("Myfile2.txt");
		File f1= new File("MyFile1.text");
		if(f1.exists())
		{
			Scanner sc= new Scanner(f1);
			while(sc.hasNextLine())
			{
				
				byte [] b1=sc.getBytes();
				f2.write(b1);
				f2.write("\n");
			}
			f2.close();
		}
		else
		{
			System.out.println("Did Not Work");
		}
	}
}