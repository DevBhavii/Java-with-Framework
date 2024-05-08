import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventHandling {
    public static void main(String args[])
    {
        JFrame f = new JFrame("Event handle");
        JTextField t = new JTextField("hello");
        t.setBounds(10, 10, 80, 40);
        JButton b = new JButton("Click me");
        b.setBounds(100, 100, 80, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.add(t);
                System.out.println("Hello Bhavii..!");
            }
        });
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
