import javax.swing.*;
public class form2
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("MyfirstJavaSwing");//frame creation
		frame.setSize(500,500);//frame creation
		frame.setVisible(true);//frame creation
		JLabel L1=new JLabel("Name",JLabel.CENTER);//Label creation
		L1.setBounds(50,100,50,50);//label creation
		frame.add(L1);
	}
}