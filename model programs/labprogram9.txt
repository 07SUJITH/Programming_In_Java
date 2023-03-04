import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorNew extends JFrame implements ActionListener {
    JButton numbers[] = new JButton[10];
    JButton clear;
    JButton add, sub, mul, div, dec, equ;
    char op;
    double result = 0, num1 = 0, num2 = 0;
    JTextField jf;

    CalculatorNew() {
        setTitle("CALCULATOR");
        setBounds(500, 100, 420, 500);
        setResizable(false);
        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(Integer.toString(i));
            numbers[i].addActionListener(this);
        }
        add = new JButton("+");
        add.addActionListener(this);
        sub = new JButton("-");
        sub.addActionListener(this);
        mul = new JButton("*");
        mul.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        dec = new JButton(".");
        dec.addActionListener(this);
        clear = new JButton("CLEAR");
        clear.addActionListener(this);
        equ = new JButton("=");
        equ.addActionListener(this);

        jf = new JTextField();
        jf.setBounds(0, 0, 410, 80);
        jf.setEditable(false);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4, 15, 15));
        p.add(numbers[7]);
        p.add(numbers[8]);
        p.add(numbers[9]);
        p.add(add);

        p.add(numbers[4]);
        p.add(numbers[5]);
        p.add(numbers[6]);
        p.add(sub);

        p.add(numbers[1]);
        p.add(numbers[2]);
        p.add(numbers[3]);
        p.add(mul);

        p.add(numbers[0]);
        p.add(dec);
        p.add(div);
        p.add(equ);
        add(jf, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
        add(clear, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++)
            if (numbers[i] == e.getSource())
                jf.setText(jf.getText() + i);
        if (clear == e.getSource())
            jf.setText("");
        else if (dec == e.getSource())
            jf.setText(jf.getText() + ".");
        else if (add == e.getSource()) {
            num1 = Double.parseDouble(jf.getText());
            jf.setText("");
            op = '+';
        } else if (sub == e.getSource()) {
            num1 = Double.parseDouble(jf.getText());
            jf.setText("");
            op = '-';
        } else if (div == e.getSource()) {
            num1 = Double.parseDouble(jf.getText());
            jf.setText("");
            op = '/';
        } else if (mul == e.getSource()) {
            num1 = Double.parseDouble(jf.getText());
            jf.setText("");
            op = '*';

        } else if (equ == e.getSource()) {
            try {
                num2 = Double.parseDouble(jf.getText());
                switch (op) {
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
                            throw new ArithmeticException("Division by zero not possible");
                        result = num1 / num2;
                        break;
                }
                jf.setText("" + result);
                num1 = result;
            } catch (ArithmeticException ex) {
                jf.setText(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorNew();
    }
}
