package calculator;
public class addition
{
	
	double d1,d2,sum1;
			
	public addition(double d11,double d12)
	{
		d1=d11;
		d2=d12;
	}
	
	public void calsum()
	{
		
		sum1=d1+d2;
	}
	
	public void display()
	{
		System.out.println("Addition of two number"+d1+"+"+d2+"="+sum1);
	}


public class multiplication
{
	
	double d1,d2,sum1;
			
	public multiplication(double d11,double d12)
	{
		d1=d11;
		d2=d12;
	}
	
	public void multiply()
	{
		
		sum1=d1*d2;
	}
	
	public void display()
	{
		System.out.println("Multiplication of two number"+d1+"  +  "+d2+"="+sum1);
	}
}
}
	