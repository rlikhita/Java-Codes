import java.io.*;
class student implements Serializable
{
	private int prn;
	private String name;
	private String course;
	
	student()
	{
		prn=31;
		name="Likhita";
		course="MBA";
	}
	
	student(int a,String b,String c)
	{
		prn=a;
		name=b;
		course=c;
	}
	
	public void display()
	{
		System.out.println("PRN::"+prn);
		System.out.println("Name::"+name);
		System.out.println("Course::"+course);
	}
	
}
class filehandling7
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream f1= new FileOutputStream("Myfile3.txt");
		
		student s1=new student();
		
		ObjectOutputStream  obj= new ObjectOutputStream  (f1);
		s1.display(); 
		 
		obj.writeObject(s1);
		
		f1.close();
		obj.close();
	}
}
		
	