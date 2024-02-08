package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import jwshin.Gyulje;

public class test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	ImageIcon a1 = new ImageIcon(Gyulje.class.getResource("image/nhAd.jpg"));
	ImageIcon a2 = new ImageIcon(Gyulje.class.getResource("image/loa.jpg"));
	ImageIcon a3 = new ImageIcon(Gyulje.class.getResource("image/loveWinsAll.jpg"));
	ImageIcon a4 = new ImageIcon(Gyulje.class.getResource("image/lol3.jpg"));

	Image a1Img = a1.getImage();
	Image a2Img = a2.getImage();
	Image a3Img = a3.getImage();
	Image a4Img = a4.getImage();

	int a1X = 0;
	int a2X = a1Img.getWidth(null);
	int a3X = a1Img.getWidth(null) + a2Img.getWidth(null);
	int a4X = a1Img.getWidth(null) + a2Img.getWidth(null) + a3Img.getWidth(null);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(599, 474);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g); // 캔버스를 비워주는 메서드
				g.drawImage(a1Img, a1X, 0, this);
				g.drawImage(a2Img, a2X, 0, this);
				g.drawImage(a3Img, a3X, 0, this);
				g.drawImage(a4Img, a4X, 0, this);
			}
		};
		panel.setBounds(18, 67, 550, 260);
		contentPane.add(panel);
		panel.setLayout(null);

		// 이미지를 움직이는 부분을 Timer를 사용하여 처리합니다.
		Timer timer = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a1X--;
				a2X--;
				a3X--;
				a4X--;

				if (a1X < -a1Img.getWidth(null)) {
					a1X = a4X + a4Img.getWidth(null);
				}
				if (a2X < -a2Img.getWidth(null)) {
					a2X = a1X + a1Img.getWidth(null);
				}
				if (a3X < -a3Img.getWidth(null)) {
					a3X = a2X + a2Img.getWidth(null);
				}
				if (a4X < -a4Img.getWidth(null)) {
					a4X = a3X + a3Img.getWidth(null);
				}

				repaint();
			}
		});
		timer.start();
	}

}
