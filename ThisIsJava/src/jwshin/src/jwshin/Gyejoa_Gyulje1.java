package jwshin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.AttributeSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class Gyejoa_Gyulje1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textBank;
	private JTextField textBankUser;
	private JTextField textGongack;
	private JTextField textBankNum;
	private JTextField textSulmyeong;
	private JTextField textBankPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gyejoa_Gyulje1 frame = new Gyejoa_Gyulje1();
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
	public Gyejoa_Gyulje1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(599, 474);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSeparator separator_2_1_3 = new JSeparator();
		separator_2_1_3.setBackground(new Color(128, 128, 128));
		separator_2_1_3.setForeground(new Color(128, 128, 128));
		separator_2_1_3.setBounds(27, 184, 343, 2);
		contentPane.add(separator_2_1_3);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBackground(new Color(128, 128, 128));
		separator_2_1.setBounds(27, 98, 343, 2);
		contentPane.add(separator_2_1);

		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBackground(new Color(128, 128, 128));
		separator_2_1_1.setBounds(27, 125, 343, 2);
		contentPane.add(separator_2_1_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(128, 128, 128));
		separator_2.setBounds(27, 68, 343, 2);
		contentPane.add(separator_2);

		JSeparator separator_2_1_2 = new JSeparator();
		separator_2_1_2.setBackground(new Color(128, 128, 128));
		separator_2_1_2.setBounds(27, 154, 343, 2);
		contentPane.add(separator_2_1_2);

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

		JLabel lblNewLabel_6 = new JLabel("상품가격");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(404, 50, 52, 15);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("할인가격");
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

		JButton btnNext = new JButton("다  음");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 다음 버튼이 눌렸을 때 실행되는 코드
				String bankText = textBank.getText();
				String bankUserText = textBankUser.getText();
				String bankNumText = textBankNum.getText();
				String bankPWText = textBankPW.getText();

				// 입력된 텍스트를 콘솔에 출력
				System.out.println("은행명: " + bankText);
				System.out.println("예금주명: " + bankUserText);
				System.out.println("계좌번호: " + bankNumText);
				System.out.println("비밀번호: " + bankPWText);

				// 모든 창 닫기
				System.exit(0);
			}
		});
		btnNext.setForeground(new Color(0, 128, 255));
		btnNext.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnNext.setBounds(410, 379, 163, 48);
		contentPane.add(btnNext);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(395, 0, 190, 437);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("고객님의 결제계좌정보를 입력하여 주십시오.");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel.setBounds(27, 42, 264, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("출금은행명");
		lblNewLabel_2.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(28, 74, 52, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("예금주명");
		lblNewLabel_2_1.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(29, 103, 52, 15);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("계좌번호");
		lblNewLabel_2_1_1.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_2_1_1.setBounds(29, 133, 52, 15);
		contentPane.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_2 = new JLabel("비밀번호");
		lblNewLabel_2_1_2.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_2_1_2.setBounds(28, 162, 52, 15);
		contentPane.add(lblNewLabel_2_1_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(24, 68, 56, 117);
		contentPane.add(panel_1);

		textBank = new JTextField();
		textBank.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		textBank.setBackground(new Color(255, 255, 255));
		textBank.setEditable(false);
		textBank.setBounds(81, 72, 106, 21);
		contentPane.add(textBank);
		textBank.setBorder(null);
		textBank.setColumns(10);

		textBankUser = new JTextField();

		textBankUser.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		textBankUser.setColumns(10);
		textBankUser.setBounds(81, 102, 106, 21);
		contentPane.add(textBankUser);
		textBankUser.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));

		textGongack = new JTextField();
		textGongack.setForeground(new Color(0, 0, 0));
		textGongack.setBackground(new Color(255, 255, 255));
		textGongack.setEditable(false);
		textGongack.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		textGongack.setText("공백없이 입력");
		textGongack.setBorder(null);
		textGongack.setColumns(10);
		textGongack.setBounds(188, 102, 106, 21);
		contentPane.add(textGongack);

		textBankNum = new JTextField();
		textBankNum.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		textBankNum.setColumns(10);
		textBankNum.setBounds(81, 129, 106, 21);
		textBankNum.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));

		// DocumentFilter를 사용하여 숫자만 입력 가능하도록 제한
		((AbstractDocument) textBankNum.getDocument()).setDocumentFilter(new DocumentFilter() {
			@Override
			public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
					throws BadLocationException {
				if (string.matches("\\d*")) {
					super.insertString(fb, offset, string, attr);
				}
			}

			@Override
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				if (text.matches("\\d*")) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		contentPane.add(textBankNum);

		textSulmyeong = new JTextField();
		textSulmyeong.setEditable(false);
		textSulmyeong.setForeground(new Color(0, 0, 0));
		textSulmyeong.setBackground(new Color(255, 255, 255));
		textSulmyeong.setText("'-'없이 입력해주세요.");
		textSulmyeong.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		textSulmyeong.setBorder(null);
		textSulmyeong.setColumns(10);
		textSulmyeong.setBounds(188, 129, 106, 21);
		contentPane.add(textSulmyeong);

		textBankPW = new JPasswordField();
		textBankPW.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		textBankPW.setColumns(10);
		textBankPW.setBounds(81, 160, 106, 21);
		textBankPW.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));

		// DocumentFilter를 사용하여 텍스트 마스킹과 입력 제한 구현
		((AbstractDocument) textBankPW.getDocument()).setDocumentFilter(new DocumentFilter() {
			@Override
			public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
					throws BadLocationException {
				// 입력 제한: 4글자까지만 입력 허용
				if (fb.getDocument().getLength() + string.length() <= 4) {
					super.insertString(fb, offset, string, attr);
				}
			}

			@Override
			public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
					throws BadLocationException {
				// 입력 제한: 4글자까지만 입력 허용
				if (fb.getDocument().getLength() + text.length() - length <= 4) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		contentPane.add(textBankPW);

	}

	public void setBankText(String bankValue) {
		textBank.setText(bankValue);
	}

}
