import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class S4_2 extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b1, b2, b3;
    JTextArea t;
    JPanel p1, p2;

    Hashtable<String, Integer> ts; // Corrected the declaration of Hashtable

    S4_2() {
        ts = new Hashtable<String, Integer>();
        t1 = new JTextField(10); // Corrected the case of JTextField
        t2 = new JTextField(10); // Corrected the case of JTextField
        t3 = new JTextField(10); // Corrected the case of JTextField

        b1 = new JButton("add");
        b2 = new JButton("search");
        b3 = new JButton("remove");

        t = new JTextArea(20, 20);
        p1 = new JPanel();
        p1.add(t1);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 3));
        p2.add(t1);
        p2.add(t2);
        p2.add(b1);
        p2.add(t3);
        p2.add(b2);
        p2.add(b3);

        add(p1);
        add(p2); // Corrected the case of variable name 'P2'

        b1.addActionListener(this);
        b2.addActionListener(this); // Corrected the method name
        b3.addActionListener(this); // Corrected the method name

        setLayout(new FlowLayout());
        setSize(300, 300); // Corrected the size
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (b1 == e.getSource()) {
            String name = t1.getText();
            int code = Integer.parseInt(t2.getText());
            ts.put(name, code);
            Enumeration<String> k = ts.keys(); // Corrected the type of Enumeration
            Enumeration<Integer> v = ts.elements(); // Corrected the type of Enumeration
            String msg = "";
            while (k.hasMoreElements()) { // Corrected the method name
                msg = msg + k.nextElement() + " =" + v.nextElement() + "\n";
                t.setText(msg);
                t1.setText("");
                t2.setText("");
            }
        } else if (b2 == e.getSource()) {
            String name = t3.getText();
            if (ts.containsKey(name)) {
                t.setText(ts.get(name).toString());
            } else
                JOptionPane.showMessageDialog(null, "City not found.....");
        } else if (b3 == e.getSource()) {
            String name = t3.getText();
            if (ts.containsKey(name)) {
                ts.remove(name);
                JOptionPane.showMessageDialog(null, "City deleted....");
            } else
                JOptionPane.showMessageDialog(null, "City not found....");
        }
    }

    public static void main(String args[]) {
        new S4_2();
    }

}
