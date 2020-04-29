import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
private JButton yesButton;
private JButton noButton;
private JButton cancelButton;
private JButton exitButton;
private JTextField txtfd;

MyFrame(){
setSize(300,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setLayout(new FlowLayout());

txtfd=new JTextField(10);

add(txtfd);

yesButton=new JButton("Yes");
yesButton.addActionListener(this);
add(yesButton);
noButton=new JButton("No");
add(noButton);
noButton.addActionListener(this);

pack();

}
public void actionPerformed(ActionEvent e){

if(e.getSource()==yesButton){
String text=yesButton.getText();
txtfd.setText(txtfd.getText()+text);
}
if(e.getSource()==cancelButton){
String text=cancelButton.getText();
txtfd.setText("Ended");
}

}
}

class AEvent2{
public static void main(String args[]){
new MyFrame().setVisible(true);
}
}