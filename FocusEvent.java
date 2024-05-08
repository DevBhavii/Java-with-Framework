import javax.swing.*;
import java.awt.event.*;

public class FocusEvent {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Focus Event Example");
        // Create a JTextField
        JTextField textField = new JTextField("Click me to see focus events!");
        // Add a FocusListener to the JTextField
        textField.addFocusListener(new FocusListener() {
            // When the component gains focus
            public void focusGained(FocusEvent e) {
                JTextField source = (JTextField) e.getSource(); // Get the source of the event
                System.out.println("Focus gained in text field: " + source.getText());
            }
            // When the component loses focus
            public void focusLost(FocusEvent e) {
                JTextField source = (JTextField) e.getSource(); // Get the source of the event
                System.out.println("Focus lost in text field: " + source.getText());
            }
        });
        // Add the JTextField to the JFrame
        frame.add(textField);
        // Set JFrame properties
        frame.setSize(300, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
