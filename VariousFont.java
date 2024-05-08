import java.awt.*;
import javax.swing.*;
class VariousFont{
    public static void main(String args[]){
        SwingUtilities.invokeLater(()->{
            JFrame f = new JFrame("*************");
            f.setSize(400,400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextArea text = new JTextArea("Hello I am Tawade bhavesh");
            JComboBox<String> jbox = new JComboBox<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
            jbox.addActionListener(e->{
                String selectedfont = (String) jbox.getSelectedItem();
                Font font =new Font(selectedfont,Font.BOLD,14);
                text.setFont(font);
            });
            f.setLayout(new BorderLayout());
            f.add(jbox,BorderLayout.NORTH);
            f.add(new JScrollPane(text),BorderLayout.CENTER);
            f.setVisible(true);
        });
    }
}