import javax.swing.JFrame;
import java.awt.*;
public class MyCanvas extends Canvas {
    public void paintComponent(Graphics g)
    {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("bhavesh.jpeg");
        g.drawImage(i, 50, 50, this);
    }
    public static void main(String args[])
    {
        JFrame f = new JFrame("Canvas Image");
        MyCanvas c = new MyCanvas();
        f.add(c);
        f.setSize(300,550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible()
    }
}
