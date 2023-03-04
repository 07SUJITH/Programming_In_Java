// palindrome checker GUI program

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeChecker1 extends JFrame implements ActionListener {

    JTextField inputfield, outputfield;
    JButton checkButton;

    PalindromeChecker1() {
        setTitle("PALINDROME CHECKER");
        setBounds(600, 200, 420, 300);
        inputfield = new JTextField();
        outputfield = new JTextField();
        outputfield.setEditable(false);
        checkButton = new JButton("CHECK");
        checkButton.addActionListener(this);
        JLabel inputlabel = new JLabel("Enter a string : ");
        JLabel outputlabel = new JLabel("result : ");
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(inputlabel);
        panel.add(inputfield);
        panel.add(outputlabel);
        panel.add(outputfield);
        panel.add(new JLabel());
        panel.add(checkButton);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == checkButton) {
            String str = inputfield.getText();
            int length = str.length();
            boolean isPalindrome = true;
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome)
                outputfield.setText(str + " is palindrome ");
            else
                outputfield.setText(str + " is not palindrome ");
        }

    }

    public static void main(String args[]) {
        new PalindromeChecker1();
    }
}
