import java.awt.*;
import javax.swing.*;
public class ShapeDraw extends JFrame{
    ShapeDraw()
    {
        super("Shapes Drawing");
        setVisible(true);
        setSize(300,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cs = getContentPane();
        Mypanel p = new Mypanel();
        cs.add(p);
        setContentPane(p);
        
    }
    public static void main(String args[])
    {
        new ShapeDraw();
    }
    
}
class Mypanel extends JPanel{
            public void paintComponent(Graphics g)
            {
                g.drawLine(20, 20, 60, 20);
                g.setColor(Color.red);
                g.fillRect(40, 40, 100, 50);
                g.setColor(Color.red);
                g.drawRect(50, 400, 100, 100);
                g.fillOval(80, 100, 140, 70);
            }
        }
