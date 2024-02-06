package jwshin;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Card_Gyulje extends JFrame {

	private static final long serialVersionUID = 3L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String selectedCard = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card_Gyulje frame = new Card_Gyulje();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Card_Gyulje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(599, 474);
		setLocationRelativeTo(null); // 창이 가운데에 위치하도록 설정

		// 결제창 오른쪽 부분 UI 시작

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbMoo = new JLabel("무이자정책");
		lbMoo.setToolTipText("클릭하시면 무이자정책을 확인할 수 있습니다.");
		lbMoo.setIcon(new ImageIcon("C:\\Users\\codepc\\eclipse-workspace\\jwshin\\src\\jwshin\\image\\plus.png"));
		lbMoo.setHorizontalAlignment(SwingConstants.CENTER);
		lbMoo.setForeground(new Color(120, 159, 199));
		lbMoo.setFont(new Font("한컴산뜻돋움", Font.BOLD, 10));
		lbMoo.setBounds(20, 219, 81, 15);
		contentPane.add(lbMoo);

		// 생성자 안에서 lbMoo JLabel 초기화 후에 다음을 추가합니다.
		lbMoo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.inicis.com/blog/archives/16302")); // "http://your-url.com"을
																										// 실제 URL로 대체하세요
				} catch (IOException | URISyntaxException ex) {
					ex.printStackTrace();
				}
			}
		});

		JButton btnNext = new JButton("다  음");
		btnNext.setForeground(new Color(0, 128, 255));
		btnNext.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnNext.setBounds(410, 379, 163, 48);
		contentPane.add(btnNext);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 기존 코드 생략

				// 계좌결제 1로 넘겨주는 코드
				Card_Gyulje1 frame = new Card_Gyulje1(selectedCard);
				frame.setVisible(true); // Gyejoa_Gyulje1 창을 보이도록 설정
				dispose(); // 현재 창 닫기
			}
		});

		JLabel lblNewLabel_5 = new JLabel("TAYO결제서비스");
		lblNewLabel_5.setFont(new Font("한컴산뜻돋움", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(132, 197, 249));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(395, 20, 103, 15);
		contentPane.add(lblNewLabel_5);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBounds(403, 38, 170, 2);
		contentPane.add(separator);

		JLabel lblNewLabel_6 = new JLabel("상품명");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(404, 50, 52, 15);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("상품가격");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_1.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_6_1.setBounds(403, 68, 52, 15);
		contentPane.add(lblNewLabel_6_1);

		JLabel lblNewLabel_6_2 = new JLabel("제공기간");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_2.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_6_2.setBounds(403, 85, 52, 15);
		contentPane.add(lblNewLabel_6_2);

		textField = new JTextField();
		textField.setText("창원시외버스터미널");
		textField.setEditable(false);
		textField.setBackground(new Color(0, 128, 255));
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("한컴 고딕", Font.BOLD, 10));
		textField.setBorder(null);
		textField.setBounds(442, 49, 131, 15);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(new Color(0, 128, 255));
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setText("별도제공기간없음");
		textField_1.setFont(new Font("한컴 고딕", Font.BOLD, 10));
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		textField_1.setBounds(442, 85, 131, 15);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(0, 128, 255));
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setFont(new Font("한컴 고딕", Font.BOLD, 10));
		textField_2.setBorder(null);
		textField_2.setColumns(10);
		textField_2.setBounds(442, 67, 131, 15);
		contentPane.add(textField_2);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBounds(403, 110, 170, 2);
		contentPane.add(separator_1);

		JLabel lblNewLabel_6_2_1 = new JLabel("결제금액");
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_2_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_2_1.setFont(new Font("한컴 고딕", Font.BOLD, 10));

		lblNewLabel_6_2_1.setBounds(405, 125, 52, 15);
		contentPane.add(lblNewLabel_6_2_1);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(new Color(0, 128, 255));
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		textField_3.setBorder(null);
		textField_3.setColumns(10);
		textField_3.setBounds(442, 122, 131, 23);
		contentPane.add(textField_3);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(395, 0, 190, 437);
		contentPane.add(panel);

		// 오른쪽 UI 끝

		// 왼쪽 위부터 시작

		JLabel lblNewLabel_1 = new JLabel("TAYO결제서비스");
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		lblNewLabel_1.setBounds(27, 10, 163, 29);
		contentPane.add(lblNewLabel_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(128, 128, 128));
		separator_2.setBackground(new Color(128, 128, 128));
		separator_2.setBounds(27, 38, 350, 2);
		contentPane.add(separator_2);

		JToggleButton btnHd = new JToggleButton("현대카드");
		btnHd.setForeground(new Color(0, 64, 128));
		btnHd.setFont(new Font("함초롬돋움", Font.BOLD, 10));
		btnHd.setBounds(20, 77, 174, 23);
		contentPane.add(btnHd);

		JToggleButton btnSs = new JToggleButton("삼성카드");
		btnSs.setForeground(new Color(0, 64, 128));
		btnSs.setFont(new Font("함초롬돋움", Font.BOLD, 10));
		btnSs.setBounds(196, 77, 174, 23);
		contentPane.add(btnSs);

		JToggleButton btnKb = new JToggleButton("KB국민");
		btnKb.setForeground(new Color(0, 64, 128));
		btnKb.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnKb.setBounds(20, 104, 87, 23);
		contentPane.add(btnKb);

		JToggleButton btnBc = new JToggleButton("비씨카드");
		btnBc.setForeground(new Color(0, 64, 128));
		btnBc.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnBc.setBounds(108, 104, 87, 23);
		contentPane.add(btnBc);

		JToggleButton btnSh = new JToggleButton("신한카드");
		btnSh.setForeground(new Color(0, 64, 128));
		btnSh.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnSh.setBounds(196, 104, 87, 23);
		contentPane.add(btnSh);

		JToggleButton btnNh = new JToggleButton("NH농협");
		btnNh.setForeground(new Color(0, 64, 128));
		btnNh.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnNh.setBounds(283, 104, 87, 23);
		contentPane.add(btnNh);

		JToggleButton btn1o = new JToggleButton("1QPay(외환)");
		btn1o.setForeground(new Color(0, 64, 128));
		btn1o.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btn1o.setBounds(283, 131, 87, 23);
		contentPane.add(btn1o);

		JToggleButton btnCt = new JToggleButton("씨티카드");
		btnCt.setForeground(new Color(0, 64, 128));
		btnCt.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnCt.setBounds(196, 131, 87, 23);
		contentPane.add(btnCt);

		JToggleButton btnLt = new JToggleButton("롯데카드");
		btnLt.setForeground(new Color(0, 64, 128));
		btnLt.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnLt.setBounds(108, 131, 87, 23);
		contentPane.add(btnLt);

		JToggleButton btn1h = new JToggleButton("1QPay(하나)");
		btn1h.setForeground(new Color(0, 64, 128));
		btn1h.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btn1h.setBounds(20, 131, 87, 23);
		contentPane.add(btn1h);

		JToggleButton btnTp = new JToggleButton("티머니페이");
		btnTp.setForeground(new Color(0, 64, 128));
		btnTp.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnTp.setBounds(20, 158, 87, 23);
		contentPane.add(btnTp);

		JToggleButton btnPc = new JToggleButton("PAYCO");
		btnPc.setForeground(new Color(0, 64, 128));
		btnPc.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnPc.setBounds(108, 158, 87, 23);
		contentPane.add(btnPc);

		JToggleButton btnLp = new JToggleButton("L.pay");
		btnLp.setForeground(new Color(0, 64, 128));
		btnLp.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnLp.setBounds(196, 158, 87, 23);
		contentPane.add(btnLp);

		JToggleButton btnTs = new JToggleButton("Toss");
		btnTs.setForeground(new Color(0, 64, 128));
		btnTs.setFont(new Font("함초롬돋움", Font.BOLD, 9));
		btnTs.setBounds(283, 158, 87, 23);
		contentPane.add(btnTs);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 10));
		textPane.setForeground(new Color(0, 64, 128));
		textPane.setText("카드사별 무이자 할부 가능 개월 수 상이\n" + "무이자 할부 제외 대상 : 법인, 체크, GIFT, 선불, 은행계열 카드");
		textPane.setBounds(20, 185, 347, 51);
		contentPane.add(textPane);

		// 하나만 선택 가능하게끔 그룹으로 묶어줌

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(btnHd);
		buttonGroup.add(btnSs);
		buttonGroup.add(btnKb);
		buttonGroup.add(btnBc);
		buttonGroup.add(btnSh);
		buttonGroup.add(btnNh);
		buttonGroup.add(btn1o);
		buttonGroup.add(btnCt);
		buttonGroup.add(btnLt);
		buttonGroup.add(btn1h);
		buttonGroup.add(btnTp);
		buttonGroup.add(btnPc);
		buttonGroup.add(btnLp);
		buttonGroup.add(btnTs);

		JToggleButton btnKk = new JToggleButton("온 국민이 다 쓰는 카카오페이");
		btnKk.setIcon(new ImageIcon("C:\\Users\\codepc\\eclipse-workspace\\jwshin\\src\\jwshin\\image\\KAKAO.png"));
		btnKk.setForeground(new Color(0, 64, 128));
		btnKk.setFont(new Font("함초롬돋움", Font.BOLD, 10));
		btnKk.setBounds(20, 50, 350, 23);
		contentPane.add(btnKk);
		buttonGroup.add(btnKk);
		// 토글 버튼에 ActionListener 추가
		btnKk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCard = "카카오페이";
			}
		});

		JToggleButton[] cardButtons = { btnHd, btnSs, btnKb, btnBc, btnSh, btnNh, btn1o, btnCt, btnLt, btn1h, btnTp,
				btnPc, btnLp, btnTs };

		// ActionListener 추가
		for (JToggleButton button : cardButtons) {
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					selectedCard = button.getText(); // 토글 버튼의 텍스트를 선택된 카드로 설정
				}
			});
		}

	}
}
