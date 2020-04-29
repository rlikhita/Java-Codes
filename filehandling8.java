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
class filehandling8
{
	public static void main(String args[]) throws IOException,ClassNotFoundException
	{
		FileInputStream f1= new FileInputStream("Myfile3.txt");
		ObjectInputStream obj= new ObjectInputStream (f1);
		student s2=null;
		s2=(student) obj.readObject();
		s2.display();
	}
}

		