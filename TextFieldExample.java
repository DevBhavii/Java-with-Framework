import javax.swing.*;  
import java.awt.*;
class TextFieldExample  
{  
   
    public static void main(String args[])  
    {  
            JFrame f= new JFrame("Instagram login"); 
            JLabel l1 = new JLabel("Username :-");
            l1.setBounds(50,80,150,20);
            JLabel l2 = new JLabel("Password :-");
            l2.setBounds(50,140,150,20);

            JTextField t1,t2;
            t1=new JTextField("Username");  
            t1.setBounds(50,100, 200,30);  

            t2=new JTextField("Password");  
            t2.setBounds(50,160, 200,30);  

            JButton b1 = new JButton("Login");
            b1.setBounds(100,220,100,30);
            b1.addActionListener(e->{
                JFrame j = new JFrame("Login");
                j.setSize(300,550);
                j.setVisible(true);
            });

            f.add(l1);
            f.add(t1); 
            f.add(l2);
            f.add(t2);
            f.add(b1);
            
            f.setSize(300,550);  
            f.setLayout(null);  
            f.setVisible(true);  
    }  
}  
