import java.io.*;
import java.util.*;
class filehandling2
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream f1 = new FileOutputStream ("MyFile.text");
		Scanner sc= new Scanner(System.in);
		String ch=" ";
		System.out.println("Enter the text . Use # to stop");		
		while (!(ch.equals("#")))
		{
			ch=sc.next();
			byte [] b1=ch.getBytes();
			f1.write(b1);
		}
	}
}