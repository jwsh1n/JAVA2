package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpFrame extends JFrame {

	private JTextField idField, nameField, emailField;
	private JPasswordField passwordField, confirmPasswordField;
	private JLabel idLabel, nameLabel, passwordLabel, confirmPasswordLabel, emailLabel;
	private JButton checkDuplicateButton, signUpButton;

	public SignUpFrame() {
		setTitle("회원가입");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		idLabel = new JLabel("아이디");
		nameLabel = new JLabel("이름");
		passwordLabel = new JLabel("비밀번호");
		confirmPasswordLabel = new JLabel("비밀번호 확인");
		emailLabel = new JLabel("이메일");

		idField = new JTextField(20);
		nameField = new JTextField(20);
		passwordField = new JPasswordField(20);
		confirmPasswordField = new JPasswordField(20);
		emailField = new JTextField(25);

		checkDuplicateButton = new JButton("아이디 중복 체크");
		signUpButton = new JButton("회원가입");

		signUpButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 비밀번호 확인
				String password = new String(passwordField.getPassword());
				String confirmPassword = new String(confirmPasswordField.getPassword());

				if (!password.equals(confirmPassword)) {
					JOptionPane.showMessageDialog(null, "비밀번호와 비밀번호 확인이 일치하지 않습니다.", "경고", JOptionPane.WARNING_MESSAGE);
					return;
				}

				// 회원가입 처리 로직을 여기에 추가
				String id = idField.getText();
				String name = nameField.getText();
				String email = emailField.getText();

				// 여기에 실제로 데이터베이스에 회원 정보를 저장하거나 다른 로직을 추가할 수 있습니다.

				System.out.println(id); // 아이디
				System.out.println(name); // 이름
				System.out.println(password); // 비밀번호
				System.out.println(email); // 이메일
			}
		});

		setLayout(new GridLayout(6, 2, 5, 5));
		add(idLabel);
		add(idField);
		add(nameLabel);
		add(nameField);
		add(passwordLabel);
		add(passwordField);
		add(confirmPasswordLabel);
		add(confirmPasswordField);
		add(emailLabel);
		add(emailField);
		add(checkDuplicateButton);
		add(signUpButton);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SignUpFrame().setVisible(true);
			}
		});
	}
}
