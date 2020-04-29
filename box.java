import java.awt.BorderLayout;
import java.awt.Container;
/*from  w w  w.  j av a2  s  .  c  o m*/
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class box {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BoxLayout  Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    JPanel hPanel = new JPanel();
    BoxLayout boxLayout = new BoxLayout(hPanel, BoxLayout.X_AXIS);
    hPanel.setLayout(boxLayout);

    for (int i = 1; i <= 5; i++) {
      hPanel.add(new JButton("Button  " + i));
    }

    contentPane.add(hPanel, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
  }
}
/*import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BoxLayout with Glue");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = frame.getContentPane();
    Box hBox = Box.createHorizontalBox();
    hBox.add(new JButton("First"));
    hBox.add(new JButton("Previous"));
    hBox.add(Box.createHorizontalGlue());
    hBox.add(new JButton("Next"));
    hBox.add(new JButton("Last"));

    contentPane.add(hBox, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
  }
}*/
