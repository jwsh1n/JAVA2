package M1D31;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class m1d31login extends JFrame {
	private JTextField userID;
	private JPasswordField userPW;

	public m1d31login() {
		setTitle("Login Page");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		getContentPane().add(panel);

		placeComponents(panel);

		setLocationRelativeTo(null); // 화면 중앙에 표시
		setVisible(true); // JFrame을 화면에 표시
	}

	private void placeComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel userLabel = new JLabel("아이디 : ");
		userLabel.setBounds(46, 20, 80, 25);
		panel.add(userLabel);

		userID = new JTextField(20);
		userID.setBounds(100, 20, 165, 25);
		panel.add(userID);

		JLabel passwordLabel = new JLabel("비밀번호 : ");
		passwordLabel.setBounds(35, 50, 80, 25);
		panel.add(passwordLabel);

		userPW = new JPasswordField(20);
		userPW.setBounds(100, 50, 165, 25);
		panel.add(userPW);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(40, 80, 100, 25);
		panel.add(loginButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(150, 80, 100, 25);
		panel.add(cancelButton);

		// 로그인 버튼의 ActionListener
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userIDText = userID.getText();
				String userPWText = String.valueOf(userPW.getPassword());

				int loginResult = validateLogin(userIDText, userPWText);

				if (loginResult == 1) {
					JOptionPane.showMessageDialog(null, "로그인 성공!");
					// 로그인 성공 시 로그인 창 닫기
					dispose();
					// 메인 창 띄우기
					new MainFrame();
				} else if (loginResult == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다. 다시 확인해주세요.");
				} else {
					JOptionPane.showMessageDialog(null, "아이디가 틀렸습니다. 다시 확인해주세요.");
				}
			}
		});

		// 취소 버튼의 ActionListener
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 취소 버튼 클릭 시 로그인 창 닫기
				dispose();
			}
		});
	}

	private int validateLogin(String userID, String userPW) {
		String jdbcUrl = "jdbc:mysql://192.168.111.200:3306/m1d31";
		String jdbcUser = "java";
		String jdbcPassword = "mysql";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
			String query = "SELECT * FROM users WHERE userID = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, userID);

				ResultSet resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					// 아이디가 존재하는 경우
					if (resultSet.getString("userPW").equals(userPW)) {
						// 비밀번호 일치
						return 1; // 로그인 성공
					} else {
						// 비밀번호 불일치
						return 0; // 비밀번호 오류
					}
				} else {
					// 아이디 불일치
					return -1; // 아이디 오류
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			return -2; // SQL 오류
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new m1d31login();
			}
		});
	}
}
