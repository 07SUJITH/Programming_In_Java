/*
  create a multiple-choice questionnaire using Java Swing and calculate the score based on the user's answers.
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MCQQuestionnare extends JFrame implements ActionListener {
    private JLabel questionLabel;
    private JRadioButton option1, option2, option3, option4;
    private JButton submitButton;
    private int score = 0;

    public MCQQuestionnare() {
        questionLabel = new JLabel(" which year the first version of Java was released ?");
        option1 = new JRadioButton("1999");
        option1 = new JRadioButton("1996");
        option1 = new JRadioButton("1995");
        option1 = new JRadioButton("1998");
        submitButton = new JButton("submit");

        ButtonGroup bg = new ButtonGroup();
        bg.add(option1);
        bg.add(option2);
        bg.add(option3);
        bg.add(option4);
        submitButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(questionLabel, BorderLayout.NORTH);
        // JPanel optionPanel = new JPanel(new GridLayout(4, 1));
        add(option1);
        add(option2);
        add(option3);
        add(option4);

        add(submitButton, BorderLayout.SOUTH);

        setTitle("MCQ Questionnare");
        setBounds(300, 100, 420, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MCQQuestionnare();
    }

    public void actionPerformed(ActionEvent e) {
        if (option3.isSelected()) {
            score++;
        }
        JOptionPane.showMessageDialog(MCQQuestionnare.this, "your score is" + score);
    }
}