import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class xyz {

    public static void main(String args[])
    {
        SwingUtilities.invokeLater(()->{
            JFrame f = new JFrame("Draw string in varios font");
            f.setSize(400,400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextArea txt = new JTextArea("Hello TYBsc student Bhavesh");
            JComboBox <String> jbox = new JComboBox<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
            jbox.addActionListener(e->{
                String Sfont = String(jbox.getSelectedItem());
                Font fnt = new Font(sfont,Font.BOLD,14);
                txt.setFont(fnt);
            });
            f.setLayout(new BorderLayout());
            f.add(new JScrollBar(txt),BorderLayout.CENTER);
            f.add(jbox,BorderLayout.NORTH);
            f.setVisible(true);
        });
    }
    
}
