import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;  
class Event2 implements ActionListener
{ 
	JFrame f1;
	JPanel p;
	JTextField t1;
	JLabel l1;
	
	Event2()
	{
		f1= new JFrame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setBounds(50,50,10,100);
		
		p = new JPanel();
		t1= new JTextField("Name");
		l1= new JLabel ("Enter your name");
		l1.setBounds(25,25,50,50);
		t1.setColumns(20);
		p.add(l1);
		p.add(t1);
		JButton b1=new JButton("Submit");
		b1.setBounds(50,50,100,100);
		p.add(b1);
		f1.add(p);
		f1.setVisible(true);
		b1.addActionListener(this); //step no 2
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		System.out.println("The ation is performed");
		
		String s1=t1.getText();
		s1=s1.toUpperCase();
		t1.setText(s1);
	}
	
	public static void main(String args[])
	{
		new Event2();
	}
}
		
		