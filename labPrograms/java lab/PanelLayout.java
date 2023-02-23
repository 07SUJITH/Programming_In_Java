import javax.swing.*;
import java.awt.*;

public class PanelLayout extends JFrame {
    PanelLayout() {
        setLayout(null);
        setBounds(500, 100, 420, 420);
        JPanel p = new JPanel();
        p.setBounds(10, 40, 300, 300);
        p.setLayout(new GridLayout(4, 4, 5, 5));
        JButton b1 = new JButton("1");
        JButton b0 = new JButton("0");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");
        JButton b11 = new JButton("11");
        JButton b12 = new JButton("12");
        JButton b13 = new JButton("13");
        JButton b14 = new JButton("14");
        JButton b15 = new JButton("15");

        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);

        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);

        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);

        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);

        // p.setVisible(true);
        add(p);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PanelLayout();
    }
}
