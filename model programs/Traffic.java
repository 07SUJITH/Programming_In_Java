
/*
    Write a Java program that simulates a traffic light. The program lets the user select one of 
    three lights: red, yellow, or green. When a radio button is selected, the light is turned on, 
    and only one light can be on at a time. No light is on when the program starts
 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JPanel implements ActionListener {
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    Color red_c;
    Color yellow_c;
    Color green_c;

    public TrafficLight() {
        setBounds(0, 0, 420, 420);
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Yellow");
        r3 = new JRadioButton("Green");

        red_c = getBackground();
        yellow_c = getBackground();
        green_c = getBackground();
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(r3);
        add(r1);
        add(r2);
        add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(60, 70, 60, 60);
        g.drawOval(60, 150, 60, 60);
        g.drawOval(60, 230, 60, 60);
        g.setColor(red_c);
        g.fillOval(60, 70, 60, 60);
        g.setColor(yellow_c);
        g.fillOval(60, 150, 60, 60);
        g.setColor(green_c);
        g.fillOval(60, 230, 60, 60);

    }

    public void actionPerformed(ActionEvent e) {

        if (r1.isSelected() == true) {
            red_c = Color.red;
            yellow_c = getBackground();
            green_c = getBackground();
        } else if (r2.isSelected() == true) {
            red_c = getBackground();
            yellow_c = Color.yellow;
            green_c = getBackground();
        } else if (r3.isSelected() == true) {
            red_c = getBackground();
            yellow_c = getBackground();
            green_c = Color.green;

        }
        repaint();
    }

}

public class Traffic {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(300, 150, 420, 420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        TrafficLight t = new TrafficLight();
        frame.add(t);
    }

}
