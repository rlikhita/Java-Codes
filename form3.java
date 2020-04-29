import javax.swing.*;
import java.awt.Container;
public class form3
{
	public static void main(String args[])
	{
		JFrame f1 = new JFrame("MyfirstJavaSwing");//frame creation
		f1.setSize(800,800);//frame creation
		f1.setVisible(true);//frame creation
		Container c1 = f1.getContentPane();
		
		JLabel L1=new JLabel("Types of Veg",JLabel.CENTER);//Label creation
	//	L1.setBounds(34,100,50,50);//label creation
		c1.add(L1);
		JButton b1= new JButton("OK");
		c1.add(b1);
		b1.setBounds(150,100,150,1
		50);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//f1.pack();
		//f1.add(b1);
	}
}