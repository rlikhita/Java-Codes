import java.io.*;

public class filehandling9
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader fin=null;
		BufferedWriter fout=null;
		
		try
		{
			fin=new BufferedReader(new FileReader ("input.txt"));
			fout=new BufferedWriter(new FileWriter("out2.txt"));
			int c;
			while((c=fin.read())!=-1)
			{
				fout.write(c);
			}
		}
		catch (FileNotFoundException e)
		{
			//e.printStackTrace();
			System.out.println("Fileee******not**************found*********");
		}
		finally
		{
			if(fin!=null)
			{
				fin.close();
			}
			if(fout!=null)
			{
				fout.close();
			}
		}
	}
}