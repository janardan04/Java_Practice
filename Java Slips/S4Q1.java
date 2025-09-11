// Slip - 4 Q1 [JAVA]
// Write a Java program using Runnable interface to blink Text on the frame.

// Question is too damn vague I'm not taking responsibility if the external doesn't approve this code at this point am just assuming what they want.

import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class S4Q1 implements Runnable {

    private JLabel label;

    public S4Q1(JLabel label) {
        this.label = label;
    }

    public void run() {
        try {
            while (true) {
                label.setVisible(true);
                TimeUnit.MILLISECONDS.sleep(500); // Text visible for 500 milliseconds
                label.setVisible(false);
                TimeUnit.MILLISECONDS.sleep(500); // Text invisible for 500 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Blinking Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Blinking Text");
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        S4Q1 blinkingText = new S4Q1(label);
        Thread thread = new Thread(blinkingText);
        thread.start();

        frame.setVisible(true);
    }
}
