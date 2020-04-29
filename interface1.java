import java.util.*;
interface vehicle
{
	public void speedup(int a);
	public void speeddown (int a);
	public void display();
}

class car implements vehicle
{
	private int model;
	private String color;
	private int gear;
	private int speed;
	
	car()
	{
		model=00;
		color="Blue";
		gear=1;
		speed=00;
	}
	
	car (int a,String b,int c,int d)
	{
		this.model=a;
		this.color=b;
		this.gear=c;
		this.speed=d;
	}
	
	public void speedup(int a)
	{
		gear++;
		speed =speed+a;
	}
	
	public void speeddown(int a)
	{
		gear--;
		speed=speed -a;
	}
	
	public void display()
	{
		System.out.println("**************CAR***************");
		System.out.println("Model number is ::" + model);
		System.out.println("Colour  is ::" + color);
		System.out.println("The can is in " + gear +" gear");
		System.out.println("The speed of the car is " + speed);
	}
}

class bicycle implements vehicle
{
	private int model;
	private String color;
	private int gear;
	private int speed;
	
	bicycle()
	{
		model=00;
		color="Blue";
		gear=3;
		speed=00;
	}
	
	bicycle(int a,String b,int c,int d)
	{
		this.model=a;
		this.color=b;
		this.gear=c;
		this.speed=d;
	}
	
	public void speedup(int a)
	{
		gear++;
		speed =speed+a;
	}
	
	public void speeddown(int a)
	{
		gear--;
		speed=speed -a;
	}
	
	public void display()
	{
		System.out.println("**************BICYCLE***************");
		System.out.println("Model number is ::" + model);
		System.out.println("Colour  is ::" + color);
		System.out.println("The bicycle is in " + gear +" gear");
		System.out.println("The speed of the car is " + speed);
	}
}	
	
class interface1
{
	public static void main(String args[])
	{
		vehicle c1=new car();
		vehicle c2=new car(01,"Red",3,40);
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the speed to increase");
		int g = sc.nextInt();
		c1.speedup(g);
		c2.speeddown(g);
		c1.display();
		c2.display();
		
		vehicle d1=new bicycle();
		vehicle d2=new bicycle(01,"Red",3,40);
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Enter the speed to increase");
		int b = sc1.nextInt();
		d1.speedup(b);
		d2.speeddown(b);
		d1.display();
		d2.display();
	}
}
		
		