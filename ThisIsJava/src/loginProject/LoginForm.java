package loginProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginForm extends JFrame {

	private JTextField userId;
	private JPasswordField userPw;
	private JButton loginButton;
	private JPanel pNorth;

	public LoginForm() {
		this.setTitle("LoginExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 조절된 크기로 창 생성
		this.setSize(new Dimension(350, 200));

		this.getContentPane().add(getPCenter(), BorderLayout.CENTER);
		this.getContentPane().add(getPNorth(), BorderLayout.NORTH);
		this.setLocationRelativeTo(null); // 창을 화면 가운데로 정렬
		this.setResizable(true); // 창 크기 조절 불가능하게 설정
	}

	public JPanel getPCenter() {
		JPanel pCenter = new JPanel();
		pCenter.add(getLoginButton());
		return pCenter;
	}

	public JButton getLoginButton() {
		if (loginButton == null) {
			loginButton = new JButton("로그인");
			loginButton.setPreferredSize(new Dimension(120, 50)); // 로그인 버튼 크기 조절
			loginButton.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					Connection conn = null;
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						conn = DriverManager.getConnection("jdbc:mysql://192.168.111.200:3306/thisisjava", "java",
								"mysql");

						conn.setAutoCommit(false);

						String sqlId = "select * from users where userid = ?";

						PreparedStatement pstmtId = conn.prepareStatement(sqlId);

						pstmtId.setString(1, userId.getText());
						ResultSet rs = pstmtId.executeQuery();
						if (rs.next()) { // 1개의 데이터 행을 가져왔을 경우
							User user = new User();
							user.setUserPassword(rs.getString("userpassword"));
							if (user.getUserPassword().equals(userPw.getText())) {
								JOptionPane.showMessageDialog(null, "로그인 성공");
							} else {
								JOptionPane.showMessageDialog(null, "pw가 노일치");
							}

						} else {
							JOptionPane.showMessageDialog(null, "id가 노일치");
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					} finally {
						if (conn != null) {
							try {
								// 연결 끊기
								conn.close();
							} catch (SQLException ex) {
							}
						}
					}
				}
			});
		}
		return loginButton;
	}

	public JPanel getPNorth() {
		if (pNorth == null) {
			pNorth = new JPanel();
			pNorth.setLayout(new GridLayout(2, 2));
			pNorth.add(new JLabel(" ID : "));
			pNorth.add(getUserId());
			pNorth.add(new JLabel(" PW : "));
			pNorth.add(getUserPw());
		}
		return pNorth;
	}

	public JTextField getUserId() {
		if (userId == null) {
			userId = new JTextField();
		}
		return userId;
	}

	public JPasswordField getUserPw() {
		if (userPw == null) {
			userPw = new JPasswordField();
		}
		return userPw;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginForm jFrame = new LoginForm();
				jFrame.setVisible(true);
			}
		});
	}
}
