import java.awt.*;
import javax.swing.*;

public class sampleColor extends JFrame {

    sampleColor()
    {
        super("Color methods");
        setVisible(true);
        setSize(300,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel j = new JPanel();
        Color c = new Color(0,255,255);
        
        j.setBackground(c);
        add(j);
        JButton b1 = new JButton("click me");
        Color c1 = new Color(255,0,255);
        b1.setBounds(100, 100, 100, 40);
        b1.setBackground(c1);
        j.add(b1);

    }
    public static void main(String args[])
    {
        new sampleColor();
    }
    
}
