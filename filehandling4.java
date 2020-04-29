import java.io.*;
import java.util.*;
class filehandling4
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File ("MyFile.text");
		if(f1.exists())
		{
			System.out.println(f1.getName());
			System.out.println(f1.getPath());
			System.out.println(f1.isFile());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.lastModified());
			System.out.println(f1.isDirectory());
			System.out.println(f1.canRead());
		}
	}
}
			