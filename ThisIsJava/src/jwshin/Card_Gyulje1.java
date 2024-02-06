package jwshin;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;

public class Card_Gyulje1 extends JFrame {

	private static final long serialVersionUID = 3_1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	ImageIcon ic1 = new ImageIcon("C:\\Users\\codepc\\eclipse-workspace\\jwshin\\src\\jwshin\\image\\Arrow.png");
	ImageIcon ic2 = new ImageIcon("C:\\Users\\codepc\\eclipse-workspace\\jwshin\\src\\jwshin\\image\\Arrow1.png");
	private JTextField textCardNum1;
	private JTextField textCardNum2;
	private JTextField textPW;
	private JPasswordField pwCardNum1;
	private JPasswordField pwCardNum2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card_Gyulje1 frame = new Card_Gyulje1("선택된 카드 정보");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Card_Gyulje1(String selectedCard) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(599, 474);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 뒤로가기 버튼에 이미지 추가

		JButton btnBack = new JButton("");
		btnBack = new JButton(
				new ImageIcon("C:\\Users\\codepc\\eclipse-workspace\\jwshin\\src\\jwshin\\image\\Arrow.png"));
		btnBack.setBounds(347, 5, 45, 30);
		btnBack.setBorderPainted(false);
		btnBack.setBackground(null);
		btnBack.setBorder(null);
		// btnBack.setContentAreaFilled(false);
		btnBack.setFocusPainted(false);
		btnBack.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15));
		contentPane.add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Card_Gyulje cardGyulje = new Card_Gyulje();
				cardGyulje.setVisible(true);
				dispose(); // 현재 창 닫기
			}
		});

		JButton btnNext = new JButton("결  제");
		btnNext.setBounds(410, 379, 163, 48);
		btnNext.setForeground(new Color(0, 128, 255));
		btnNext.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		contentPane.add(btnNext);

		JLabel lblNewLabel_5 = new JLabel("TAYO결제서비스");
		lblNewLabel_5.setBounds(395, 20, 103, 15);
		lblNewLabel_5.setFont(new Font("한컴산뜻돋움", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(132, 197, 249));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_5);

		JSeparator separator = new JSeparator();
		separator.setBounds(403, 38, 170, 2);
		separator.setForeground(new Color(128, 128, 128));
		contentPane.add(separator);

		JLabel lblNewLabel_6 = new JLabel("상품명");
		lblNewLabel_6.setBounds(404, 50, 52, 15);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("상품가격");
		lblNewLabel_6_1.setBounds(403, 68, 52, 15);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_1.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		contentPane.add(lblNewLabel_6_1);

		JLabel lblNewLabel_6_2 = new JLabel("제공기간");
		lblNewLabel_6_2.setBounds(403, 85, 52, 15);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_2.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		contentPane.add(lblNewLabel_6_2);

		textField = new JTextField();
		textField.setBounds(442, 49, 131, 15);
		textField.setText("창원시외버스터미널");
		textField.setEditable(false);
		textField.setBackground(new Color(0, 128, 255));
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("한컴 고딕", Font.BOLD, 10));
		textField.setBorder(null);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(442, 85, 131, 15);
		textField_1.setEditable(false);
		textField_1.setBackground(new Color(0, 128, 255));
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setText("별도제공기간없음");
		textField_1.setFont(new Font("한컴 고딕", Font.BOLD, 10));
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(442, 67, 131, 15);
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(0, 128, 255));
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setFont(new Font("한컴 고딕", Font.BOLD, 10));
		textField_2.setBorder(null);
		textField_2.setColumns(10);
		contentPane.add(textField_2);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(403, 110, 170, 2);
		separator_1.setForeground(Color.GRAY);
		contentPane.add(separator_1);

		JLabel lblNewLabel_6_2_1 = new JLabel("결제금액");
		lblNewLabel_6_2_1.setBounds(405, 125, 52, 15);
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_2_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_6_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_2_1.setFont(new Font("한컴 고딕", Font.BOLD, 10));
		contentPane.add(lblNewLabel_6_2_1);

		textField_3 = new JTextField();
		textField_3.setBounds(442, 122, 131, 23);
		textField_3.setEditable(false);
		textField_3.setBackground(new Color(0, 128, 255));
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		textField_3.setBorder(null);
		textField_3.setColumns(10);
		contentPane.add(textField_3);

		JPanel panel = new JPanel();
		panel.setBounds(395, 0, 190, 437);
		panel.setBackground(new Color(0, 128, 255));
		contentPane.add(panel);
		// 오른쪽 UI 끝

		// 선택된 카드 정보 활용 예시
		JLabel lblSelectedCard = new JLabel(selectedCard);
		lblSelectedCard.setBounds(10, 10, 373, 55);
		lblSelectedCard.setForeground(new Color(0, 128, 255));
		lblSelectedCard.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		contentPane.add(lblSelectedCard);

		JLabel lblNewLabel = new JLabel("ISP결제");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		lblNewLabel.setBounds(20, 68, 81, 27);
		contentPane.add(lblNewLabel);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(128, 128, 128));
		separator_2.setBounds(10, 98, 366, 2);
		contentPane.add(separator_2);

		JLabel lblNewLabel_1 = new JLabel("ISP 선택");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 104, 58, 23);
		contentPane.add(lblNewLabel_1);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.GRAY);
		separator_2_1.setBounds(10, 132, 366, 2);
		contentPane.add(separator_2_1);

		JLabel lbCardNum = new JLabel("카드번호 입력");
		lbCardNum.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		lbCardNum.setBounds(20, 153, 93, 23);
		contentPane.add(lbCardNum);

		textCardNum1 = new JTextField();
		textCardNum1.setBounds(30, 180, 79, 21);
		textCardNum1.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		contentPane.add(textCardNum1);
		textCardNum1.setColumns(10);

		// DocumentFilter를 사용하여 숫자만 입력 가능하도록 제한
		((AbstractDocument) textCardNum1.getDocument()).setDocumentFilter(new DocumentFilter() {
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				if (text.matches("\\d*") && fb.getDocument().getLength() + text.length() - length <= 4) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		pwCardNum1 = new JPasswordField();
		pwCardNum1.setBounds(110, 180, 79, 21);
		pwCardNum1.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		contentPane.add(pwCardNum1);

		// DocumentFilter를 사용하여 텍스트 마스킹과 입력 제한 구현
		((AbstractDocument) pwCardNum1.getDocument()).setDocumentFilter(new DocumentFilter() {
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				// 입력 제한: 4글자까지만 입력 허용
				if (fb.getDocument().getLength() + text.length() - length <= 4) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		pwCardNum2 = new JPasswordField();
		pwCardNum2.setBounds(190, 180, 79, 21);
		pwCardNum2.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		contentPane.add(pwCardNum2);

		// DocumentFilter를 사용하여 텍스트 마스킹과 입력 제한 구현
		((AbstractDocument) pwCardNum2.getDocument()).setDocumentFilter(new DocumentFilter() {
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				// 입력 제한: 4글자까지만 입력 허용
				if (fb.getDocument().getLength() + text.length() - length <= 4) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		textCardNum2 = new JTextField();
		textCardNum2.setColumns(10);
		textCardNum2.setBounds(270, 180, 79, 21);
		textCardNum2.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		contentPane.add(textCardNum2);

		// DocumentFilter를 사용하여 숫자만 입력 가능하도록 제한
		((AbstractDocument) textCardNum2.getDocument()).setDocumentFilter(new DocumentFilter() {
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				if (text.matches("\\d*") && fb.getDocument().getLength() + text.length() - length <= 4) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		JLabel lbPW = new JLabel("결제비밀번호");
		lbPW.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		lbPW.setBounds(20, 220, 93, 23);
		contentPane.add(lbPW);

		textPW = new JPasswordField();
		textPW.setBounds(110, 220, 161, 21);
		textPW.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
		contentPane.add(textPW);

		// DocumentFilter를 사용하여 텍스트 마스킹과 입력 제한 구현
		((AbstractDocument) textPW.getDocument()).setDocumentFilter(new DocumentFilter() {
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				// 입력 제한: 4글자까지만 입력 허용
				if (fb.getDocument().getLength() + text.length() - length <= 4) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(
				new ImageIcon("C:\\Users\\codepc\\eclipse-workspace\\jwshin\\src\\jwshin\\image\\warning.png"));
		lblNewLabel_2.setBounds(277, 220, 30, 21);
		contentPane.add(lblNewLabel_2);

	}
}
