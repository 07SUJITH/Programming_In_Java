
/*
    Write a Java program that simulates a traffic light. The program lets the user select one of 
    three lights: red, yellow, or green. When a radio button is selected, the light is turned on, 
    and only one light can be on at a time. No light is on when the program starts
 
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TrafficLight11 extends JPanel implements ActionListener {

    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    Color redC;
    Color yellowC;
    Color greenC;

    TrafficLight11() {
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("yellow");
        r3 = new JRadioButton("green");
        redC = getBackground();
        yellowC = getBackground();
        greenC = getBackground();
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        add(r1);
        add(r2);
        add(r3);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(50, 50, 50, 50);
        g.drawOval(50, 110, 50, 50);
        g.drawOval(50, 170, 50, 50);
        g.setColor(redC);
        g.fillOval(50, 50, 50, 50);
        g.setColor(yellowC);
        g.fillOval(50, 110, 50, 50);
        g.setColor(greenC);
        g.fillOval(50, 170, 50, 50);

    }

    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            redC = Color.red;
            yellowC = getBackground();
            greenC = getBackground();
        }

        else if (r2.isSelected()) {
            redC = getBackground();
            yellowC = Color.yellow;
            greenC = getBackground();
        }

        else if (r3.isSelected()) {
            redC = getBackground();
            yellowC = getBackground();
            greenC = Color.green;
        }

        repaint();
    }
}

public class Traffic11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TRAFFIC LlIGHT");
        frame.setBounds(500, 100, 420, 420);
        TrafficLight11 tf = new TrafficLight11();
        frame.add(tf);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
