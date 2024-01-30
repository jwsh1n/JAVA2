package sec06.exam03_jradiobutton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class JRadioButtonExample extends JFrame {
	private JPanel radioPanel;
	private JRadioButton rbBird;
	private JRadioButton rbCat;
	private JRadioButton rbDog;
	private JRadioButton rbSnake;
	private JLabel lblPicture;

	public JRadioButtonExample() {
		setTitle("JRadioButtonExample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getRadioPanel(), BorderLayout.SOUTH);
		this.getContentPane().add(getLblPicture(), BorderLayout.CENTER);
		pack();
	}

	public JPanel getRadioPanel() {
		if (radioPanel == null) {
			radioPanel = new JPanel();
			radioPanel.setLayout(new GridLayout(1, 4));
			radioPanel.add(getRbBird());
			radioPanel.add(getRbCat());
			radioPanel.add(getRbDog());
			radioPanel.add(getRbSnake());

			ButtonGroup group = new ButtonGroup();
			group.add(getRbBird());
			group.add(getRbCat());
			group.add(getRbDog());
			group.add(getRbSnake());

		}
		return radioPanel;
	}

	public JRadioButton getRbBird() {
		if (rbBird == null)
			rbBird = new JRadioButton();
		rbBird.setText("Bird");
		rbBird.setSelected(true);
		rbBird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getLblPicture().setIcon(new ImageIcon(getClass().getResource("Bird.gif")));
				System.out.println("새를 선택했습니다.");
			}
		});
		return rbBird;
	}

	public JRadioButton getRbCat() {
		if (rbCat == null) {
			rbCat = new JRadioButton();
			rbCat.setText("Cat");
			rbCat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("Cat.gif")));
					System.out.println("고양이를 선택했습니다.");
				}
			});
		}
		return rbCat;
	}

	public JRadioButton getRbDog() {
		if (rbDog == null)
			rbDog = new JRadioButton();
		rbDog.setText("Dog");
		rbDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getLblPicture().setIcon(new ImageIcon(getClass().getResource("dog.gif")));
				System.out.println("개를 선택했습니다.");
			}
		});
		return rbDog;
	}

	public JRadioButton getRbSnake() {
		if (rbSnake == null)
			rbSnake = new JRadioButton();
		rbSnake.setText("Snake");
		rbSnake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getLblPicture().setIcon(new ImageIcon(getClass().getResource("snake.gif")));
				System.out.println("뱀을 선택했습니다.");
			}
		});
		return rbSnake;
	}

	public JLabel getLblPicture() {
		if (lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("Bird.gif")));
		}
		return lblPicture;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JRadioButtonExample jFrame = new JRadioButtonExample();
				jFrame.setVisible(true);
			}
		});
	}
}