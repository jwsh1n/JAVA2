package jwshin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Gyejoa_Gyulje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ButtonGroup radioGroup;
	private JRadioButton radioBank1;
	private JRadioButton radioBank2;
	private DefaultComboBoxModel<String> comboBoxModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gyejoa_Gyulje frame = new Gyejoa_Gyulje();
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
	public Gyejoa_Gyulje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(599, 474);
		setLocationRelativeTo(null); // 창이 가운데에 위치하도록 설정

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		radioGroup = new ButtonGroup();

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

		JComboBox<String> choiceBank = new JComboBox<>(comboBoxModel);
		choiceBank.setBackground(new Color(255, 255, 255));
		choiceBank.setBounds(141, 137, 143, 23);
		contentPane.add(choiceBank);

		JButton btnNext = new JButton("다  음");
		btnNext.setForeground(new Color(0, 128, 255));
		btnNext.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnNext.setBounds(410, 379, 163, 48);
		contentPane.add(btnNext);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 기존 코드 생략

				// 여기에 추가적인 코드 작성
				Gyejoa_Gyulje1 frame = new Gyejoa_Gyulje1();
				frame.setBankText((String) choiceBank.getSelectedItem()); // 은행 값 전달
				frame.setVisible(true); // Gyejoa_Gyulje1 창을 보이도록 설정
				dispose(); // 현재 창 닫기
			}
		});

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼이 클릭되었을 때 실행될 코드 작성
				if (radioBank1.isSelected()) {
					// 은행 계좌이체 라디오 버튼이 선택된 경우
					System.out.println("선택한 라디오 버튼: 은행 계좌이체");
				} else if (radioBank2.isSelected()) {
					// 증권사 계좌이체 라디오 버튼이 선택된 경우
					System.out.println("선택한 라디오 버튼: 증권사 계좌이체");
				}

				// 여기에 추가적인 코드 작성
				Gyejoa_Gyulje1 frame = new Gyejoa_Gyulje1();
				frame.setVisible(true); // Gyejoa_Gyulje1 창을 보이도록 설정
				dispose(); // 현재 창 닫기
			}
		});

		JLabel lblNewLabel_1 = new JLabel("TAYO결제서비스");
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		lblNewLabel_1.setBounds(27, 10, 163, 29);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("결제방식 선택");
		lblNewLabel_2.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		lblNewLabel_2.setBounds(28, 49, 82, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("고객님의 예금을 인출할 은행/증권사를 선택해주세요.");
		lblNewLabel_3.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(28, 67, 286, 15);
		contentPane.add(lblNewLabel_3);

		radioBank1 = new JRadioButton("은행 계좌이체");
		radioBank1.setSelected(true);
		radioBank1.setBackground(new Color(255, 255, 255));
		radioBank1.setFont(new Font("한컴 고딕", Font.PLAIN, 11));
		radioBank1.setBounds(27, 105, 119, 23);
		contentPane.add(radioBank1);
		// 라디오버튼 그룹에 추가
		radioGroup.add(radioBank1);

		radioBank2 = new JRadioButton("증권사 계좌이체");
		radioBank2.setBackground(new Color(255, 255, 255));
		radioBank2.setFont(new Font("한컴 고딕", Font.PLAIN, 11));
		radioBank2.setBounds(184, 105, 103, 23);
		contentPane.add(radioBank2);
		// 라디오버튼 그룹에 추가
		radioGroup.add(radioBank2);



				comboBoxModel.removeAllElements();
				comboBoxModel.addElement("경남은행");
				comboBoxModel.addElement("부산은행");
				comboBoxModel.addElement("광주은행");
				comboBoxModel.addElement("대구은행");
				comboBoxModel.addElement("전북은행");
				comboBoxModel.addElement("제주은행");
				comboBoxModel.addElement("카카오뱅크");
				comboBoxModel.addElement("케이뱅크");
				comboBoxModel.addElement("토스뱅크");
				comboBoxModel.addElement("신한은행");
				comboBoxModel.addElement("국민은행");
				comboBoxModel.addElement("하나은행");
				comboBoxModel.addElement("우리은행");
				comboBoxModel.addElement("제일은행");


		
		// 라디오 버튼에 대한 ActionListener 추가
		radioBank1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 은행 계좌이체 선택 시 콤보박스 모델 업데이트
				comboBoxModel.removeAllElements();
				comboBoxModel.addElement("경남은행");
				comboBoxModel.addElement("부산은행");
				comboBoxModel.addElement("광주은행");
				comboBoxModel.addElement("대구은행");
				comboBoxModel.addElement("전북은행");
				comboBoxModel.addElement("제주은행");
				comboBoxModel.addElement("카카오뱅크");
				comboBoxModel.addElement("케이뱅크");
				comboBoxModel.addElement("토스뱅크");
				comboBoxModel.addElement("신한은행");
				comboBoxModel.addElement("국민은행");
				comboBoxModel.addElement("하나은행");
				comboBoxModel.addElement("우리은행");
				comboBoxModel.addElement("제일은행");
			}
		});

		radioBank2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 증권사 계좌이체 선택 시 콤보박스 모델 업데이트
				comboBoxModel.removeAllElements();
				comboBoxModel.addElement("KB증권");
				comboBoxModel.addElement("NH투자증권");
				comboBoxModel.addElement("SK증권");
				comboBoxModel.addElement("미래에셋대우");
				comboBoxModel.addElement("미래에셋증권");
				comboBoxModel.addElement("부국증권");
				comboBoxModel.addElement("삼성증권");
				comboBoxModel.addElement("신영증권");
				comboBoxModel.addElement("유진투자증권");
				comboBoxModel.addElement("유화증권");
				comboBoxModel.addElement("키움증권");
				comboBoxModel.addElement("한국투자증권");
				comboBoxModel.addElement("한양증권");
				comboBoxModel.addElement("한화증권");
				// 다른 증권사 목록 추가

			}
		});

		JLabel lblNewLabel_4 = new JLabel("서비스 가능시간 : 00:30 ~ 24:00");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(27, 193, 257, 15);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("최대이체한도 금액 : 2,000,000 원");
		lblNewLabel_4_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_4_1.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_4_1.setBounds(27, 208, 257, 15);
		contentPane.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("최소이체가능 금액 : 150 원");
		lblNewLabel_4_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_4_2.setFont(new Font("한컴 고딕", Font.PLAIN, 10));
		lblNewLabel_4_2.setBounds(27, 224, 257, 15);
		contentPane.add(lblNewLabel_4_2);

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

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(395, 0, 190, 437);
		contentPane.add(panel);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		separator_2.setBounds(27, 133, 356, 2);
		contentPane.add(separator_2);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.GRAY);
		separator_2_1.setBounds(27, 165, 356, 2);
		contentPane.add(separator_2_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(27, 135, 106, 30);
		contentPane.add(panel_1);
		
				JLabel lblNewLabel = new JLabel("계좌이체 은행");
				panel_1.add(lblNewLabel);
				lblNewLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
	}
}
