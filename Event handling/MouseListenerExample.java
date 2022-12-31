import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener{
    Label displayLabel;
    MouseListenerExample(){
        super("MOUSE");
        addMouseListener(this);
        displayLabel = new Label();
        displayLabel.setBounds(20,50,100,20);
        add(displayLabel);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    //Overrides
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

    public static void main(String[] args){

        new MouseListenerExample();
    }
}