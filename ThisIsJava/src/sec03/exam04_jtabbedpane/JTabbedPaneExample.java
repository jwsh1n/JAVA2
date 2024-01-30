package sec03.exam04_jtabbedpane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JTabbedPaneExample extends JFrame {
	private JTabbedPane jTabbdePane;
	private JPanel tab1Panel;
	private JPanel tab2Panel;

	public JTabbedPaneExample() {
		this.setTitle("JTabbedPaneExample");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getJTabbedPane(), BorderLayout.CENTER);
	}

	private JTabbedPane getJTabbedPane() {
		if (jTabbdePane == null) {
			jTabbdePane = new JTabbedPane();
			jTabbdePane.setTabPlacement(JTabbedPane.RIGHT);
			jTabbdePane.addTab("탭1", getTab1Panel());
			jTabbdePane.addTab("탭2", getTab2Panel());
		}
		return jTabbdePane;
	}

	private JPanel getTab1Panel() {
		if (tab1Panel == null) {
			tab1Panel = new JPanel();
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("duke.gif")));
			tab1Panel.add(jLabel);
		}
		return tab1Panel;
	}

	// Tab2에 추가될 JPanel 생성
	private JPanel getTab2Panel() {
		if (tab2Panel == null) {
			tab2Panel = new JPanel();
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("duke2.gif")));
			tab2Panel.add(jLabel);
		}
		return tab2Panel;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTabbedPaneExample jFrame = new JTabbedPaneExample();
				jFrame.setVisible(true);
			}
		});
	}
}
