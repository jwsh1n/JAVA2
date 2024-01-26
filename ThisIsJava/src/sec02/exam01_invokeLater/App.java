package sec02.exam01_invokeLater;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App extends JFrame {
	public App() {
		// 제목 설정
		setTitle("Swing App");
		// 윈도우 크기 설정
		setSize(300, 100);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				App app = new App();

				app.setVisible(true);
				System.out.println(Thread.currentThread().getName());
			}
		});
	}

}
