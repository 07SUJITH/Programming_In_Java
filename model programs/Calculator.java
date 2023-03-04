
/* 
 Write a Java program that works as a simple calculator. Arrange Buttons for digits and 
the + - * % operations properly. Add a text field to display the result. Handle any possible 
exceptions like divide by zero. Use Java Swing*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField tf;
    JButton addButton, divButton, subButton, mulButton, modButton, clearButton, decButton, equButton;
    JButton number[] = new JButton[10];
    JPanel panel;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator() {
        super("CALCUALTOR");
        setBounds(550, 100, 420, 600);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        tf = new JTextField();
        tf.setBounds(20, 20, 370, 50);
        tf.setEditable(false);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf);
        panel = new JPanel();
        panel.setBounds(20, 150, 370, 400);
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        for (int i = 0; i < 10; i++) {
            number[i] = new JButton("" + i);
            number[i].addActionListener(this);
        }
        addButton = new JButton("+");
        addButton.addActionListener(this);
        divButton = new JButton("/");
        divButton.addActionListener(this);
        subButton = new JButton("-");
        subButton.addActionListener(this);
        mulButton = new JButton("*");
        mulButton.addActionListener(this);
        modButton = new JButton("%");
        modButton.addActionListener(this);
        clearButton = new JButton("clear");
        clearButton.addActionListener(this);
        decButton = new JButton(".");
        decButton.addActionListener(this);
        equButton = new JButton("=");
        equButton.addActionListener(this);
        clearButton.setBounds(300, 80, 90, 50);
        modButton.setBounds(230, 80, 50, 50);
        add(modButton);
        add(clearButton);
        panel.add(number[7]);
        panel.add(number[8]);
        panel.add(number[9]);
        panel.add(addButton);
        panel.add(number[4]);
        panel.add(number[5]);
        panel.add(number[6]);
        panel.add(subButton);
        panel.add(number[1]);
        panel.add(number[2]);
        panel.add(number[3]);
        panel.add(mulButton);
        panel.add(number[0]);
        panel.add(decButton);
        panel.add(divButton);
        panel.add(equButton);
        add(panel);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++)
            if (e.getSource() == number[i])
                tf.setText(tf.getText() + i);
        if (e.getSource() == clearButton)
            tf.setText("");
        if (e.getSource() == decButton)
            tf.setText(tf.getText() + ".");
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(tf.getText());
            operator = '+';
            tf.setText("");
        } else if (e.getSource() == subButton) {
            num1 = Double.parseDouble(tf.getText());
            operator = '-';
            tf.setText("");
        } else if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(tf.getText());
            operator = '*';
            tf.setText("");
        } else if (e.getSource() == divButton) {
            num1 = Double.parseDouble(tf.getText());
            operator = '/';
            tf.setText("");
        } else if (e.getSource() == modButton) {
            num1 = Double.parseDouble(tf.getText());
            operator = '%';
            tf.setText("");
        } else if (e.getSource() == equButton) {
            try {
                num2 = Double.parseDouble(tf.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0)
                            throw new ArithmeticException("division by zero is not possible ");
                        result = num1 / num2;
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                }
                tf.setText("" + result);
                num1 = result;
            } catch (ArithmeticException ex) {
                tf.setText(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
