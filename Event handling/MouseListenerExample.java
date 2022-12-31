import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class MouseListenerExample implements MouseListener{
    JFrame frame;
    Label displayLabel;
    MouseListenerExample(){
        frame =new JFrame("MOUSE EXAMPLE");
        frame.addMouseListener(this);
        displayLabel = new Label();
        displayLabel.setBounds(20,50,100,20);
        frame.add(displayLabel);
        frame.setBounds(300,50,300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 

    public static void main(String[] args){
        new MouseListenerExample();
    }

    @Override
    public void mouseClicked(MouseEvent e){
        displayLabel.setText("mouse Clicked");
    }
    public void mousePressed(MouseEvent e){
        displayLabel.setText("mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        displayLabel.setText("mouse released");
    }
    public void mouseEntered(MouseEvent e){
        displayLabel.setText("mouse entered");
    }
    public void mouseExited(MouseEvent e){
         displayLabel.setText("mouse exited");
    }
}