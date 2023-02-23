import javax.swing.*;
import java.awt.*;

public class Traffic2 extends JFrame {

    private JRadioButton redButton, yellowButton, greenButton;
    private JPanel lightPanel;

    public Traffic2() {
        setTitle("Traffic Light");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Create button group and add radio buttons to it
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add action listeners to radio buttons
        redButton.addActionListener(e -> turnOnRed());
        yellowButton.addActionListener(e -> turnOnYellow());
        greenButton.addActionListener(e -> turnOnGreen());

        // Create light panel
        lightPanel = new JPanel();
        lightPanel.setPreferredSize(new Dimension(100, 100));

        // Add radio buttons and light panel to content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(redButton);
        contentPane.add(yellowButton);
        contentPane.add(greenButton);
        contentPane.add(lightPanel);
    }

    private void turnOnRed() {
        lightPanel.setBackground(Color.RED);
    }

    private void turnOnYellow() {
        lightPanel.setBackground(Color.YELLOW);
    }

    private void turnOnGreen() {
        lightPanel.setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        Traffic2 trafficLight = new Traffic2();
        trafficLight.setVisible(true);
    }
}
