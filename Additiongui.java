import javax.swing.JOptionPane;

 public class Additiongui
{
	public static void main(String args[])
	{
		String a = JOptionPane.showInputDialog("Enter first integer");
		String b = JOptionPane.showInputDialog("Enter second integer");
		
		int number1=Integer.parseInt(a);
		int number2=Integer.parseInt(b);
		
		int sum=number1+number2;
		
		JOptionPane.showMessageDialog(null,"The sum is " + sum,JOptionPane.QUESTION_MESSAGE);
	}
}