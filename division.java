package calculator;
public class division
{
	
	double d1,d2,sum1;
			
	public division(double d11,double d12)
	{
		d1=d11;
		d2=d12;
	}
	
	public void divide()
	{
		
		sum1=d1*d2;
	}
	
	public void display()
	{
		System.out.println("Division of two number"+d1+"  / "+d2+"="+sum1);
	}
}
