import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeChecker extends JFrame implements ActionListener {

    JTextField outputField, inputField;
    JButton submitButton;

    PrimeChecker() {

        setTitle("PRIME CHECKER");
        setBounds(600, 150, 420, 200);
        setResizable(false);

        outputField = new JTextField(10);
        outputField.setEditable(false);
        inputField = new JTextField(10);
        JLabel readLabel = new JLabel("Enter a number :");
        JLabel outputLabel = new JLabel("Output : ");

        submitButton = new JButton("SUBMIT");
        submitButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(readLabel);
        panel.add(inputField);
        panel.add(outputLabel);
        panel.add(outputField);
        panel.add(new JLabel());
        panel.add(submitButton);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            try {
                int number = Integer.parseInt(inputField.getText());// may throws NumberFormatException
                boolean isPrime = true;
                if (number < 2)
                    isPrime = false;
                else {
                    for (int i = 2; i <= number / 2; i++)
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                }
                if (isPrime)
                    outputField.setText(number + " is  a  prime ");
                else
                    outputField.setText(number + " is  not a  prime ");

            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input ! ");
            }
        }
    }

    public static void main(String[] args) {
        new PrimeChecker();
    }

}

/*
 * ALGORITHM
 * 
 * [1] START
 * [2] Import the required packages:javax.swing,java.awt,java.awt.event
 * [3] Define a class "PrimeChecker" extends JFrame and implements
 * ActionListener.
 * [4] Declare instance variables of the class JTextField " outputField "and
 * " inputField " ,JButton " submitButton "
 * [5] Define a constructor for the PrimeChecker class:
 * (1) Set the title of the GUI window to "PRIME CHECKER".
 * (2) Set the position and size of the GUI window using the setBounds method.
 * (3) Instantiate the declared instances in step 3
 * outputField: a text field with a width of 10 characters, which is initially
 * not editable.
 * inputField: a text field with a width of 10 characters.
 * submitButton: a button with the text "CHECK"
 * (4) create object of JLabel class " readLabel " with argument text
 * "Enter a number :".
 * (5) create object of JLabel class " outputLabel " with argument text
 * "Output:"."
 * (6) create a object of JPanel class " panel " , uses a GridLayout with 3 rows
 * and 2 columns to organize the GUI components.
 * (7) Add an ActionListener to the submitbutton using the addActionListener()
 * method.
 * (8) Add the GUI components to the panel using add method of panel
 * (9) Add the panel to the frame.
 * (10) set the visibilty of frame true using setVisible method
 * (11)Set the default close operation of the frame to EXIT_ON_CLOSE
 * [6] Override the actionPerformed() method with argument e (object of
 * ActionEvent)
 * (1)if e.getSource() is equal to submitButton then do the following steps from
 * 2 to
 * (2)inside the try block
 * (1) read the input from the inputField using getText()
 * (2) convet the text number to integer number using parseInt() method of
 * Integer class and store in variable number
 * (3) intialize a boolean variable isPrime as true
 * (4) if(number < 2) then set isPrime = false ;
 * (5) else then
 * (1)initialize i =2;
 * (2) while(i<= number/2) do
 * (1) if(number%2==0) then set isPrime = false and goto step
 * (2) i =i+1
 * (6) if(isPrime==true) then
 * (6.1) set the text of outputField as "number is prime " using setText()
 * method
 * (7)else
 * (7.1) set the text of outputField as "number is not prime " using setText()
 * method
 * (3) inside the catch block
 * (3.1) if an NumberFormatException is throws from parseInt() method
 * then set the text of outputField as "invalid input "
 * [7] define a main method
 * (1) create an object of PrimeChecker class
 * [8] STOP
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */