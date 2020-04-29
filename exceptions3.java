import java.util.*;
public class exceptions3
 {
   public static void main(String[] args) 
   {
      Random rd = new Random(); // creating Random object
      int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++)
		{
			 arr[i] = rd.nextInt(); // storing random integers in an array
			// System.out.println(arr[i]+"\n"); // printing each array element
		}
		try
		{
			int number=0;
			Scanner sc= new Scanner(System.in);			
			System.out.println("Which element of the array has to be displayed?");
			number=sc.nextInt();
			System.out.println("The value is " + arr[number]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("***Out of Bound***");
				
			}
   }
}