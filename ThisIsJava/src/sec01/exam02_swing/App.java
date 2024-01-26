package sec01.exam02_swing;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class App extends JFrame {
	public App() {
		setTitle("Swing App");

		setSize(300, 100);
		getContentPane().add(new JButton("OK"), BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		App app = new App();

		app.setVisible(true);

	}

}
