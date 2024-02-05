package jwshin;  //클래스가 속한 패키지


//사용한 임포트 선언
import java.awt.EventQueue; //
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Gyulje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gyulje frame = new Gyulje();
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
	public Gyulje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(599, 474);
		setLocationRelativeTo(null); // 창이 가운데에 위치하도록 설정

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnGyejoa = new JButton("계좌 결제");
		btnGyejoa.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnGyejoa.setBounds(191, 88, 213, 117);
		contentPane.add(btnGyejoa);

		JButton btnCard = new JButton("카드 결제");
		btnCard.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnCard.setBounds(191, 241, 213, 117);
		contentPane.add(btnCard);

		// 뒤로가기 버튼
		JButton backButton = new JButton("뒤로가기");
		backButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		backButton.setBounds(401, 10, 100, 30);
		contentPane.add(backButton);

		// 홈 버튼
		JButton homeButton = new JButton("홈");
		homeButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		homeButton.setBounds(511, 10, 50, 30);
		contentPane.add(homeButton);

		// 계좌 결제 버튼 클릭 시
		btnGyejoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gyejoa_Gyulje gyejoa = new Gyejoa_Gyulje();
				gyejoa.setVisible(true);
			}
		});

		// 카드 결제 버튼 클릭 시
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Card_Gyulje cardGyulje = new Card_Gyulje();
				cardGyulje.setVisible(true);
			}
		});
	}
}
