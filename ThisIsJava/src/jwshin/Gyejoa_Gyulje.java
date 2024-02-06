package jwshin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup; //라디오 박스 그룹으로 묶기위해 사용
import javax.swing.DefaultComboBoxModel; //콤보박스 선택 옵션 제어하기위해 사용
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants; //텍스트 정렬, 정수, 상수 제공 클래스(?)
import javax.swing.border.EmptyBorder; //빈테두리 생성 클래스

public class Gyejoa_Gyulje extends JFrame {

	private static final long serialVersionUID = 2L;
	private JPanel contentPane; // UI구현을 위한 프레임배치에 사용됨
	private JTextField textField; // 상품가격
	private JTextField textField_1; // 별도제공기간없음
	private JTextField textField_2; // 할인가격
	private JTextField textField_3; // 총결제금액
	private ButtonGroup radioGroup; // 라디오박스 그룹화해서 둘 중 하나만 선택가능하게끔 하기 위해 그룹 생성
	private JRadioButton radioBank1; // 라디오박스1
	private JRadioButton radioBank2; // 라디오박스2

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gyejoa_Gyulje frame = new Gyejoa_Gyulje(); // 실행되면 결좌결제창 구현
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gyejoa_Gyulje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫으면 프로그램 종료 설정
		setSize(599, 474);
		setLocationRelativeTo(null); // 창이 가운데에 위치하도록 설정

		contentPane = new JPanel(); // 패널 생성
		contentPane.setBackground(new Color(255, 255, 255)); // 배경색상 흰색으로 지정
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 외곽공간 설정
		setContentPane(contentPane);
		contentPane.setLayout(null); // 레이아웃 자유롭게 사용하기위해 설정

		radioGroup = new ButtonGroup(); // 라디오버튼 그룹으로 묶기위해 그룹생성

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(); // 체크박스 선택지들을 문자열(String)로 설정함을 표현

		JComboBox<String> choiceBank = new JComboBox<>(comboBoxModel); // 성종이한테 물어봐야지(?)
		choiceBank.setBackground(new Color(255, 255, 255));
		choiceBank.setBounds(141, 137, 143, 23); // x, y, 너비, 높이
		contentPane.add(choiceBank); // 선택한은행 화면에 표시(근데 초이스뱅크 어딨음..? 왜 굳이 초이스뱅크로 재설정.?)

		radioBank1 = new JRadioButton("은행 계좌이체");
		radioBank1.setSelected(true); // 기본값으로 지정
		radioBank1.setBackground(new Color(255, 255, 255));
		radioBank1.setFont(new Font("한컴 고딕", Font.PLAIN, 11));
		radioBank1.setBounds(27, 105, 119, 23);
		contentPane.add(radioBank1); // 화면에 표시
		// 라디오버튼 그룹에 추가
		radioGroup.add(radioBank1);

		radioBank2 = new JRadioButton("증권사 계좌이체");
		radioBank2.setBackground(new Color(255, 255, 255));
		radioBank2.setFont(new Font("한컴 고딕", Font.PLAIN, 11));
		radioBank2.setBounds(184, 105, 103, 23);
		contentPane.add(radioBank2);
		// 라디오버튼 그룹에 추가
		radioGroup.add(radioBank2);
		// 기본설정으로 지정
		comboBoxModel.removeAllElements();  // 모든 모델 재설정
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
				// 다른 증권사 목록 추가
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
				Gyejoa_Gyulje1 frame = new Gyejoa_Gyulje1();
				frame.setBankText((String) choiceBank.getSelectedItem()); // 은행 값 전달
				frame.setVisible(true); // Gyejoa_Gyulje1 창을 보이도록 설정
				dispose(); // 현재 창 닫기
			}
		});

		// UI구현
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
