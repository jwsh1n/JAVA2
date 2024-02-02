package jwshin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;

public class heowongaib extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heowongaib frame = new heowongaib();
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
	public heowongaib() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 1301);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 244, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 372, 605, 62);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(191, 222, 605, 62);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(191, 526, 605, 62);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(191, 827, 605, 62);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(191, 669, 605, 62);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setColumns(10);
		textField_6.setBounds(191, 961, 605, 62);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("중복체크");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setBounds(667, 174, 129, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		lblNewLabel.setBounds(191, 184, 163, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("창원시외버스터미널");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 34));
		lblNewLabel_1.setBounds(268, 40, 416, 102);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(191, 332, 163, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("비밀번호 입력");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		lblNewLabel_2_1.setBounds(191, 485, 163, 40);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		lblNewLabel_2_1_1.setBounds(191, 629, 163, 40);
		contentPane.add(lblNewLabel_2_1_1);
		
		lblNewLabel_2_2 = new JLabel("ID 찾기 힌트");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		lblNewLabel_2_2.setBounds(191, 921, 163, 40);
		contentPane.add(lblNewLabel_2_2);
		
		lblNewLabel_2_3 = new JLabel("이메일");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		lblNewLabel_2_3.setBounds(191, 787, 163, 40);
		contentPane.add(lblNewLabel_2_3);
	}
}
