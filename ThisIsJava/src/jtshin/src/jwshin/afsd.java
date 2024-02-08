package jwshin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class afsd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					afsd frame = new afsd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public afsd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(68, 143, 95, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		btnNewButton.setBounds(124, 33, 95, 23);
		btnNewButton.setBackground(new Color(0, 128, 255));
		contentPane.add(btnNewButton);
	}
}
