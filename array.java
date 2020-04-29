import java.util.*;
class point
{
	private int px;
	private int py;
	void input(int x, int y)
	{
		px=x;
		py=y;
	}
	void show()
	{
		System.out.println("("+px+","+py+")");
	}
}
class array
{
	public static void main(String args[])
	{
		point p1[]=new point[10];
		int i;
		System.out.println("Points are");
		for(i=0;i<p1.length;i++)
		{
			p1[i]=new point();
			p1[i].input(234+i*2,254+i*3);
			p1[i].show();
		}
	}
}