import java.util.*;
class student
{
	
	int PRN;
	String name;
	
	student()
	{
		PRN=01;
		name="Aaditya";
	}
	
	student(int a, String b)
	{
		PRN=a;
		name=b;
	}
	
	public String display()
	{
		System.out.println("PRN"+ PRN);
		System.out.println("Name"+ name);
		return(PRN+name);
		
	}
}
class collections3
{
	
	public static void main(String args[])
	{
		Map<Integer,student> s1= new HashMap<Integer,student>();
		student s2=new student(123,"abc");
		student s3=new student(456,"bca");
		student s4=new student(789,"cab");
		
		s1.put(100,s4);
		s1.put(200,s2);
		s1.put(300,s3);
		
		
		
		//Elements can transverse in any order
		
		for(Map.Entry <Integer, student> m:s1.entrySet())
		{
			student s5=m.getValue();
			System.out.println(m.getKey()+" "+s5.display());
		}
	}
}