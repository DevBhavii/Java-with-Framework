import javax.swing.*;
import java.awt.event.*;
public class keyListener {
    static char a;
    static JFrame f;
    static class MyKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            System.out.println("key presses "+ e.getKeyChar());
            a = e.getKeyChar();
            JTextField tf = new JTextField(a);
            f.add(tf);
        }
    
        public void keyReleased(KeyEvent e)
        {
            System.out.println("key released "+ e.getKeyChar());
        }
    }    
    public static void main(String args[])
    {
        f = new JFrame("keyboard event");
        f.addKeyListener(new MyKeyListener());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });

        

        f.setSize(300,550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}