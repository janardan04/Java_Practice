// Slip - 20 Q1 [JAVA]
// Write a java program to blink image on the JFrame continuously.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class S20Q2 extends JFrame {
    private ImageIcon imageIcon;
    private JLabel imageLabel;

    public S20Q2() {
        setTitle("Blinking Image");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        imageIcon = new ImageIcon("C:/Users/shash/Pictures/Screenshots/screenshot.433.jpg");
        imageLabel = new JLabel(imageIcon);

        getContentPane().add(imageLabel, BorderLayout.CENTER);

        Timer timer = new Timer(500, new ActionListener() {
            private boolean visible = true;

            public void actionPerformed(ActionEvent e) {
                imageLabel.setVisible(visible);
                visible = !visible;
            }
        });
        timer.start();
    }

    public static void main(String args[]) {
        new S20Q2().setVisible(true);
    }
}
