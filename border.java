import java.awt.BorderLayout;
import java.awt.Container;
//from   w w  w . j  a v  a  2s  .  co m
import javax.swing.JButton;
import javax.swing.JFrame;

public class border {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BorderLayout Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container container = frame.getContentPane();

    // Add a button to each of the five areas of the BorderLayout
    container.add(new JButton("North"), BorderLayout.NORTH);
    container.add(new JButton("South"), BorderLayout.SOUTH);
    container.add(new JButton("East"), BorderLayout.EAST);
    container.add(new JButton("West"), BorderLayout.WEST);
    container.add(new JButton("Center"), BorderLayout.CENTER);

    frame.pack();
    frame.setVisible(true);
  }
}
