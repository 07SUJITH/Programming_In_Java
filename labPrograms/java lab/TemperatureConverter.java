/*
 Write a Java program that uses two textfields and a button. The first textfield 
accepts temperature in Celsius. When the 'Convert' button is clicked the 
second textfield displays the temperature in Fahrenheit. Use appropriate 
Swing components and event handling techniques. F-(C*9/5)+32
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {
    private JTextField celsiusField, fahrenheitField;
    private JButton convertButton;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(420, 420);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusField = new JTextField(10);
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitField = new JTextField(10);
        fahrenheitField.setEditable(false);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        panel.add(celsiusLabel);
        panel.add(celsiusField);
        panel.add(fahrenheitLabel);
        panel.add(fahrenheitField);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(convertButton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            fahrenheitField.setText(" " + fahrenheit);
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();

    }
}
