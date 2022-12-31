import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons= new JButton[10];
    JButton[] functionButton=new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,delButton,clrButton;
    JPanel panel;
    double num1=0,num2=0,result=0;
    char operator;
    Calculator(){
        Font myFont = new Font("Ink Free",Font.BOLD,35);
        frame =new JFrame("CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,150,420,550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(147, 161, 96));
        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);
        addButton =new JButton("+");
        subButton =new JButton("-");
        mulButton =new JButton("*");
        divButton =new JButton("/");
        decButton =new JButton(".");
        equButton =new JButton("=");
        delButton =new JButton("delete");
        clrButton =new JButton("clear");
        functionButton[0] =addButton;
        functionButton[1] =subButton;
        functionButton[2] =mulButton;
        functionButton[3] =divButton;
        functionButton[4] =decButton;
        functionButton[5] =equButton;
        functionButton[6] =delButton;
        functionButton[7] =clrButton;
        for(int i=0;i<8;i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);
        }
        for(int i=0;i<10;i++){
            numberButtons[i] =new JButton(""+i);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);
        panel =new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);    
        frame.add(textField);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void main(String argd[]){
        Calculator calc =new Calculator();
    }
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<10;i++)
            if(e.getSource()==numberButtons[i])
                textField.setText(textField.getText() + i);
        if(e.getSource()==clrButton)
                textField.setText("");
        if(e.getSource()==decButton)
            textField.setText(textField.getText() + ".");   
        if(e.getSource()==addButton){
            num1= Double.parseDouble(textField.getText());
            operator='+';
            textField.setText("");
        }
        if(e.getSource()==subButton){
            num1= Double.parseDouble(textField.getText());
            operator='-';
            textField.setText("");
        }
        if(e.getSource()==mulButton){
            num1= Double.parseDouble(textField.getText());
            operator='*';
            textField.setText("");
        }
        if(e.getSource()==divButton){
            num1= Double.parseDouble(textField.getText());
            operator='/';
            textField.setText("");
        }
        if(e.getSource()==equButton){
            num2=Double.parseDouble(textField.getText());
            switch(operator){
                case '+':result=num1+num2;break;
                case '-':result=num1-num2;break;
                case '*':result=num1*num2;break;
                case '/':result=num1/num2;break;
            }
            textField.setText(""+result);
            num1=result;
        }
        if(e.getSource()==delButton){
            String string =textField.getText();
            textField.setText("");
            for(int i=0;i<string.length()-1;i++)
                 textField.setText(textField.getText()+string.charAt(i));
        }
    }
}
