package M1D31;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

	public MainFrame() {
		setTitle("Main Page");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		getContentPane().add(panel);

		JLabel welcomeLabel = new JLabel("로그인에 성공하셨어요! 쨖쨖쨖쨖");
		welcomeLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		panel.add(welcomeLabel);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();
			}
		});
	}
}