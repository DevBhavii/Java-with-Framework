import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListener {
    public static void main(String args[])
    {
        
        JFrame f = new JFrame("Mouse Events");
        f.addMouseListener( new MouseAdapter() {
            JFrame j;
            public void mouseEntered(MouseEvent e)
            {
                j = new JFrame("new Frame");
                Mypanel p = new Mypanel();
                j.add(p);
                System.out.print("\nMouse Enterd");
                j.setSize(200,400);
                j.setVisible(true);
            }

            public void mouseExited(MouseEvent e)
            {
                j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                System.out.println("\nMouse Exited");
            }
        });


        f.setSize(300,550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    static class Mypanel extends JPanel{
        public void paintComponent(Graphics g)
        {
            g.drawOval(80, 60, 100, 40);
        }

    }
    
}
