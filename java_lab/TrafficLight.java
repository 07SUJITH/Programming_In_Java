import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TrafficLight extends JFrame implements ActionListener {
    String msg = "";
    private JLabel label;
    private JTextField display;
    private JRadioButton r1, r2, r3;
    private ButtonGroup bg;

    public TrafficLight() {
        setLayout(new FlowLayout());
        label = new JLabel("Traffic Light");
        display = new JTextField(10);
        display.setEditable(false);
        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("GREEN");
        r3 = new JRadioButton("YELLOW");
        bg = new ButtonGroup();
        add(label);
        add(r1);
        add(r2);
        add(r3);
        add(display);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        setSize(350, 420);
        setVisible(true);
        setResizable(false);
        getContentPane().setBackground(Color.pink);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        msg = e.getActionCommand();
        if (msg.equals("RED")) {
            getContentPane().setBackground(Color.RED);
            display.setText(msg + " :TURN ON");
        } else if (msg.equals("GREEN")) {
            getContentPane().setBackground(Color.GREEN);
            display.setText(msg + ":TURN ON");
        } else if (msg.equals("YELLOW")) {
            getContentPane().setBackground(Color.YELLOW);
            display.setText(msg + " :TURN ON");
        }
    }
    public static void main(String args[]) {
        new TrafficLight();
    }
}