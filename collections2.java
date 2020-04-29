import java.util.*;
public class collections2 //Linked Lists                                                                                                                 
{
	public static void main(String args[])
	{
		LinkedList<String> al= new LinkedList<String>();
		al.add("Ravi");
		al.add("Mani");
		al.add("Kani");
		al.add("Navi");
		
		Iterator<String> itr = al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("************************************");
			//transverse the list in reverse order
			Iterator i = al.descendingIterator();
			while ( i.hasNext())
			{
				System.out.println(i.next());
			}
	}
}