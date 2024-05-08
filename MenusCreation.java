import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListener extends JFrame {
    ActionListener() {
        super("ActionListner class");

        Container c = getContentPane();
        c.setBackground(Color.DARK_GRAY);

        JButton b1 = new JButton("Open");
        b1.addActionListener(e -> {

            Container s = getContentPane();
            s.setBackground(Color.WHITE);
            JOptionPane.showMessageDialog(null, "Hello...🙌🥰👨🏻‍💻","Dialog Box",JOptionPane.INFORMATION_MESSAGE);

            JButton b2 = new JButton("CLick me");
            b2.setBounds(100, 200, 100, 20);
            s.add(b2, getLayout());

            b2.addActionListener(a -> {

                Xypanel xy = new Xypanel();
                xy.setBackground(Color.MAGENTA);

                add(xy);
                // setContentPane(cc);

            });
            setContentPane(s);
        });

        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.ORANGE);
        setJMenuBar(mb);

        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Home");
        JMenu m3 = new JMenu("Insert");
        JMenu m4 = new JMenu("View");
        JMenu m5 = new JMenu("Disign");
        JMenu m6 = new JMenu("Layout");

        mb.add(m1);
        mb.add(new JSeparator());
        mb.add(m2);
        mb.add(new JSeparator());
        mb.add(m3);
        mb.add(new JSeparator());
        mb.add(m4);
        mb.add(new JSeparator());
        mb.add(m5);
        mb.add(new JSeparator());
        mb.add(m6);
        mb.add(new JSeparator());

        m1.setMnemonic(KeyEvent.VK_F);
        m2.setMnemonic(KeyEvent.VK_H);
        m3.setMnemonic(KeyEvent.VK_I);
        m4.setMnemonic(KeyEvent.VK_V);
        m5.setMnemonic(KeyEvent.VK_D);
        m6.setMnemonic(KeyEvent.VK_L);

        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        JMenuItem i4 = new JMenuItem("Save as");
        JMenuItem i5 = new JMenuItem("Send");
        JMenuItem i6 = new JMenuItem("Exit");

        m1.add(i1);
        m1.add(new JSeparator());
        m1.add(i2);
        m1.add(new JSeparator());
        m1.add(i3);
        m1.add(new JSeparator());
        m1.add(i4);
        m1.add(new JSeparator());
        m1.add(i5);
        m1.add(new JSeparator());
        m1.add(i6);
        m1.add(new JSeparator());

        c.add(b1, BorderLayout.SOUTH);
        setContentPane(c);
        setSize(300, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new ActionListener().setVisible(true));
    }

    public class Xypanel extends JPanel {
        public void paintComponent(Graphics g) {

            g.drawArc(100, 200, 200, 200, 0, 360);

        }
    }

}
