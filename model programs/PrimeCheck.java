import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeCheck extends JFrame {
    private JTextField inputField, outputField;
    private JButton checkButton;

    public PrimeCheck() {
        // set up the window
        setTitle("Prime Checker");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the components
        inputField = new JTextField(10);
        outputField = new JTextField(10);
        outputField.setEditable(false);
        checkButton = new JButton("Check");

        // add the components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3, 2));
        contentPane.add(new JLabel("Enter a number: "));
        contentPane.add(inputField);
        contentPane.add(new JLabel("Result: "));
        contentPane.add(outputField);
        contentPane.add(new JLabel(""));
        contentPane.add(checkButton);

        // add event listener to the button
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputStr = inputField.getText();
                try {
                    int inputNum = Integer.parseInt(inputStr);
                    boolean isPrime = true;
                    if (inputNum < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(inputNum); i++) {
                            if (inputNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        outputField.setText(inputNum + " is a prime number.");
                    } else {
                        outputField.setText(inputNum + " is not a prime number.");
                    }
                } catch (NumberFormatException ex) {
                    outputField.setText("Invalid input!");
                }
            }
        });
    }

    public static void main(String[] args) {
        PrimeCheck primeCheck = new PrimeCheck();
        primeCheck.setVisible(true);
    }
}
