package jwshin; //클래스가 속한 패키지

//사용한 임포트 선언
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent; //버튼클릭 구현
import java.awt.event.ActionListener; //버튼 누르면 발생되는 것들 구현
import java.awt.Color;

public class Gyulje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gyulje frame = new Gyulje(); // 클래스 객체 생성
					frame.setVisible(true); // 화면에 프레임 표시
				} catch (Exception e) {
					e.printStackTrace(); // 예외가 발생할경우 예외 콘솔창에 출력 및 예외 처리안될시 프로그램 강제 종료 방지
				}
			}
		});
	}

	public Gyulje() { // 결제 클래스 생성자 메소드 정의
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을때 프로그램 종료
		setSize(599, 474); // 창 사이즈 설정
		setLocationRelativeTo(null); // 창이 가운데에 위치하도록 설정

		contentPane = new JPanel(); // JPanel 생성
		contentPane.setBackground(new Color(255, 255, 255)); // 배경색상 흰생으로 설정
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 상하좌우 외곽빈공간 설정
		setContentPane(contentPane); // ()안에 창을 컨텐츠 패널로 설정(?)
		contentPane.setLayout(null); // 레이아웃을 수동으로 배치가능하도록 null로 설정

		// ↓변수지정
		JButton btnGyejoa = new JButton("계좌 결제");
		btnGyejoa.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnGyejoa.setBounds(191, 88, 213, 117); // x, y, 너비, 높이
		contentPane.add(btnGyejoa); // 버튼을 패널에 추가하여 창에 표시되게끔 설정

		// 계좌 결제 버튼 클릭 시
		btnGyejoa.addActionListener(new ActionListener() { // 동작 설정
			public void actionPerformed(ActionEvent e) { // 설정된 동작 정의
				Gyejoa_Gyulje gyejoa = new Gyejoa_Gyulje(); // 계좌 새 프레임 생성
				gyejoa.setVisible(true); // 계좌결제 버튼 누르면 새로운 계좌결제 화면 나타남
			}
		});

		JButton btnCard = new JButton("카드 결제");
		btnCard.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnCard.setBounds(191, 241, 213, 117);
		contentPane.add(btnCard);

		// 카드 결제 버튼 클릭 시
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Card_Gyulje cardGyulje = new Card_Gyulje();
				cardGyulje.setVisible(true);
			}
		});

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

	}
}
