import java.io.*;
class filehandling1
{
	public static void main(String args[])
	{
		try
		{
			File f1 = new File ("C:/Users/dell/Documents");
			f1.createNewFile();
		}
		catch (IOException e)
		{
			System.out.println("File already exist");
			e.printStackTrace();
		}
	}
}