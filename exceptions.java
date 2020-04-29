class exceptions
{
	public static void main(String args[])
	{
		String s1="Likhita", s2="XYZ" , s3="01";
			try
			{
				
				System.out.println("Output=  "+ s1.length());
				int num = Integer.parseInt(s1);
				System.out.println("Num= "+num);
				num=Integer.parseInt(s3);
				System.out.println("Num=  "+num);
			}
			/*catch (ArithmeticException e)
			{
				System.out.println("Error in main program");
				e.printStackTrace();
				System.out.println("Std message  "+ e.toString());
				System.out.println("Std message  "+ e.getMessage());
			}*/
			catch (NullPointerException e)
			{
				System.out.println("Error in program");
				e.printStackTrace();
				System.out.println("Std message  "+ e.toString());
				System.out.println("Std message  "+ e.getMessage());
			}
			
			catch(NumberFormatException f)
			{
				System.out.println("Error in program");
				f.printStackTrace();
				System.out.println("Std message  "+ f.toString());
				System.out.println("Std message  "+ f.getMessage());
			}
		finally
		{
			System.out.println("This is final block");
			int num=Integer.parseInt(s3);
			System.out.println("Num=  "+s3);
		}
	}
}