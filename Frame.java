// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import javax.swing.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating instance of JFrame
		JFrame frame = new JFrame("Button Sample");

		JLabel l = new JLabel("label 1");
		l.setBounds(150,140,100,100);

		// Creating instance of JButton
		JButton button = new JButton(" GFG WebSite Click");

		// x axis, y axis, width, height
		button.setBounds(150, 200, 220, 50);

		// adding button in JFrame
		frame.add(button);
		frame.add(l);

		// 400 width and 500 height
		frame.setSize(500, 600);

		// using no layout managers
		frame.setLayout(null);

		// making the frame visible
		frame.setVisible(true);

		// Use for closing frame explicitly
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
