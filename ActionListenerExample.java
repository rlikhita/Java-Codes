import java.awt.*;  
import java.awt.event.*;  
//1st step   -Implement the ActionListener interface in the class:
public class ActionListenerExample implements ActionListener{  
public static void main(String[] args) {  
    Frame f=new Frame("ActionListener Example");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);
//2nd step   -Register the component with the Listener:
    b.addActionListener(this);  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
//3rd step  - Override the actionPerformed() method:
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to JavatSwing.");  
}  
} 