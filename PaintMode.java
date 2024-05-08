import javax.swing.*;
import java.awt.*;
public class PaintMode extends JFrame{
    private int p = AlphaComposite.SRC_OVER;
    public PaintMode()
    {
        JButton b = new JButton("Change paint");
        b.setBounds(100,400,100,20);
        b.addActionListener(e -> {
            p = (p==1)?3:1;repaint();
        });
        add(b,BorderLayout.NORTH);
        setTitle("Paintmode");
        setSize(300,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setComposite(AlphaComposite.getInstance(p));
        g2.setColor(Color.CYAN);
        g2.fillOval(100, 250, 100, 70);
        g2.draw3DRect(100,230,100,100,false);
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(()-> new PaintMode().setVisible(true));
    }
   
    
}
