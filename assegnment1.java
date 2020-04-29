import java.util.*;
abstract class Animal
{
	protected int legs;
	
	protected Animal(int a)
	{
		legs=a;
	}
	
	public void walk()
	{
		System.out.println("The animal is walking");
	}
	
	abstract public void eat()
	{
		System.out.println("The animal is eating");
		System.out.println("The animal has "+legs+"legs);
	}
	
}
class spider extends Animal
{
	spider(int a)
	{
		super(8);
	}
	
	public void eat1()
	{
		eat();
		System.out.println("The Spider is eating");
	}
}
interface Pet
{
	public String getName();
	public void setName();
	public void play();
}

class cat extends Animal implements Pet
{
	private String name;
	cat(String a,4)
	{
		super(4);
		name=a;
	}
	
	cat()
	{
		super()
	}
	
	public String getName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the cat");
		name= nextLine();
		return name;
	}
	
	public void setName(name)
	{
		name="Rocky";
		System.out.println("The new name of the cat is "+ name);
	}
	
	public void play()
	{
		System.out.println("The cat is playing");
	}
	
	public void eat2()
	{	
		eat();
		System.out.println("The cat is eating");
	}
}

class fish extends Animal implements Pet
{
	fish()
	{
		super();
	}
	
	public string getName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the fish")
		name= nextLine();
		return name;
	}
	
	public void setName()
	{
		name="Nemo";
		System.out.println("The new name is "+ name);
	}
	public void play()
	{
		System.out.println("The fish is playing");
	}
	
	public void eat3()
	{	
		eat();
		System.out.println("The fish is eating");
	}
	
	public void walk()
	{
		System.out.println("The fish cannot walk");
	}
}
class assegnment1
{
	public static void main (String args[])
	{
		
		
		
	}
}

