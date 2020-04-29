import java.util.*;
abstract class outdoorgame
{
	private String groundname;
	private int time;
	private int players;
	
	outdoorgame()
	{
		groundname="GHMC";
		time=40;
		players=14;
	}
	
	outdoorgame(String a,int b,int c)
	{
		groundname=a;
		time=b;
		players=c;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ground name::");
		groundname= sc.next();
		System.out.println("Enter the time the game is palyed for::");
		time= sc.nextInt();
		System.out.println("Enter the no of players in a team::");
		players= sc.nextInt();
	}
	
	public void print()
	{
		System.out.println("Ground name::"+ groundname);
		System.out.println("Time the game is palyed for::"+ time);
		System.out.println("No of players in a team::"+ players);
	}
		
}

class football extends outdoorgame
{
	private String captain;
	
	
	football()
	{
		super();
		captain="Sunil Chhetri";
	}
	
	football(String a, int b,int c,String d)
	{
		super(a,b,c);
		captain=d;
	}
	
	public void accept1()
	{
		accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Captain's name::");
		captain= sc.next();
	}
	
	public void print1()
	{
		System.out.println("*********Football Class******");
		print();
		System.out.println("Captain's name::"+ captain);
	}
}
class cricket extends outdoorgame
{
	private String fan;
	
	cricket()
	{
		super();
		fan="Virat Kholi";
	}
	
	cricket(String a, int b, int c, String d)
	{
		super(a,b,c);
		fan=d;
	}
	
	public void accept2()
	{
		accept();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the player's name whose fan you are");
		fan = sc.next();
	}
	
	public void print2()
	{
		System.out.println("*********Cricket Class******");
		print();
		System.out.println("You are a fan of ::" + fan);
	}
}
class games
{
	public static void main(String args[])
	{
		football f1= new football();
		f1.accept1();
		f1.print1();
		
		cricket c1= new cricket();
		c1.accept2();
		c1.print2();
	}
}
		