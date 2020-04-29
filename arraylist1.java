//Program to create a array list
import java.util.*;

class arraylist1
{
	public static void main(String args[])
	{
		List <Integer> arr=new ArrayList<Integer>(4);
		arr.add(2);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		System.out.println(arr);
		System.out.println(arr.get(1));
		Collections.sort(arr);
		System.out.println(arr);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		int a=Collections.frequency(Arrays.asList(arr),2);
		System.out.println(a);
		//Collections.disjoint(Arrays.asList(arr));
		
	}
}