package jwshin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Gyulje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	ImageIcon IU = new ImageIcon(Gyulje.class.getResource("image/loveWinsAll.jpg"));
	ImageIcon loa = new ImageIcon(Gyulje.class.getResource("image/loa.jpg"));
	ImageIcon lol = new ImageIcon(Gyulje.class.getResource("image/lol3.jpg"));
	ImageIcon nh = new ImageIcon(Gyulje.class.getResource("image/nhAd.jpg"));

	Image iuImg = IU.getImage();
	Image loaImg = loa.getImage();
	Image lolImg = lol.getImage();
	Image nhImg = nh.getImage();

	int iuX = 0;
	int loaX = iuImg.getWidth(null);
	int lolX = loaImg.getWidth(null);
	int nhX = lolImg.getWidth(null);

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Gyulje frame = new Gyulje();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Gyulje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(599, 474);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 결제 버튼
		JButton btnGyejoa = new JButton("결제");
		btnGyejoa.setForeground(new Color(170, 213, 255));
		btnGyejoa.setIcon(new ImageIcon(Gyulje.class.getResource("image/Cash.png")));
		btnGyejoa.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		btnGyejoa.setBorder(null);
		btnGyejoa.setBackground(null);
		btnGyejoa.setFocusPainted(false);
		btnGyejoa.setBounds(125, 318, 170, 100);
		contentPane.add(btnGyejoa);

		// 결제 버튼 클릭 시
		btnGyejoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 결제 화면으로 이동하는 코드
			}
		});

		// 카드 결제 버튼
		JButton btnCard = new JButton("결제");
		btnCard.setForeground(new Color(170, 213, 255));
		btnCard.setIcon(new ImageIcon(Gyulje.class.getResource("image/Card.png")));
		btnCard.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		btnCard.setBorder(null);
		btnCard.setBackground(null);
		btnCard.setFocusPainted(false);
		btnCard.setBounds(300, 318, 170, 100);
		contentPane.add(btnCard);

		// 카드 결제 버튼 클릭 시
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 카드 결제 화면으로 이동하는 코드
			}
		});

		// 뒤로가기 버튼
		JButton backButton = new JButton("");
		backButton.setIcon(new ImageIcon(Gyulje.class.getResource("image/Arrow.png")));
		backButton.setForeground(new Color(0, 128, 255));
		backButton.setBorder(null);
		backButton.setBackground(null);
		backButton.setFocusPainted(false);
		backButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		backButton.setBounds(475, 10, 50, 30);
		contentPane.add(backButton);

		// 홈 버튼
		JButton homeButton = new JButton("");
		homeButton.setIcon(new ImageIcon(Gyulje.class.getResource("image/home.png")));
		homeButton.setForeground(new Color(0, 128, 255));
		homeButton.setBorder(null);
		homeButton.setBackground(null);
		homeButton.setFocusPainted(false);
		homeButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		homeButton.setBounds(523, 10, 50, 30);
		contentPane.add(homeButton);

		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g); // 캔버스를 비워주는 메서드
				g.drawImage(loaImg, loaX, 0, this);
				g.drawImage(iuImg, iuX, 0, this);
				g.drawImage(lolImg, lolX, 0, this);
				g.drawImage(nhImg, nhX, 0, this);
			}
		};
		panel.setBounds(18, 45, 550, 260);
		contentPane.add(panel);
		panel.setLayout(null);

		// 이미지를 움직이는 부분을 Timer를 사용하여 처리합니다.
		Timer timer = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				iuX--;
				loaX--;
				lolX--;
				nhX--;

				if (iuX < -iuImg.getWidth(null)) {
					iuX = iuX + nhImg.getWidth(null);
				}
				if (loaX < -loaImg.getWidth(null)) {
					loaX = loaX + iuImg.getWidth(null);
				}
				if (lolX < -lolImg.getWidth(null)) {
					lolX = lolX + loaImg.getWidth(null);
				}
				if (nhX < -nhImg.getWidth(null)) {
					nhX = nhX + lolImg.getWidth(null);
				}

				repaint();
			}
		});
		timer.start();
	}
}
