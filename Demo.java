abstract class A
{
	void show()
	{
		System.out.println("Display with A class.");
	}
	void display()
	{
		System.out.println("Display function in class A ");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("Display with B class");
	}
}

class C extends A
{
	void show()
	{
		System.out.println("Display with C class");
	}
}

class Demo
{
	public static void main (String arg[])
	{
		A ref;
		
		
		
		ref=new B();
		ref.show();
		ref.display();
		
		ref=new C();
		ref.show();
		ref.display();
	}
}