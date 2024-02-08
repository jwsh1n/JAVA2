package ChatGpt;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PaymentServlet extends JFrame {

	public PaymentServlet() {
		setTitle("Payment Method Selection");
		setSize(600, 400); // 크기 조절
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 패널 추가
		JPanel panel = new JPanel();

		JButton cardPaymentButton = new JButton("카드 결제");
		cardPaymentButton.setBounds(0, 0, 586, 181);
		JButton accountPaymentButton = new JButton("계좌 결제");
		accountPaymentButton.setBounds(0, 181, 586, 181);

		cardPaymentButton.setPreferredSize(new Dimension(200, 100)); // 고정된 크기 설정
		accountPaymentButton.setPreferredSize(new Dimension(200, 100)); // 고정된 크기 설정

		cardPaymentButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 카드 결제 로직 추가
				showCardPaymentDialog();
			}
		});

		accountPaymentButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 계좌 이체 로직 추가
				showAccountTransferDialog();
			}
		});
		panel.setLayout(null);

		panel.add(cardPaymentButton);
		panel.add(accountPaymentButton);

		// 패널을 프레임에 추가
		getContentPane().add(panel);

		// 화면 중앙에 위치하도록 설정
		setLocationRelativeTo(null);

		setVisible(true);
	}

	private void showCardPaymentDialog() {
		JOptionPane.showMessageDialog(this, "카드 결제 선택");
		// 카드 결제 로직 추가
	}

	private void showAccountTransferDialog() {
		JOptionPane.showMessageDialog(this, "계좌 결제 선택");
		// 계좌 이체 로직 추가
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PaymentServlet();
			}
		});
	}
}
