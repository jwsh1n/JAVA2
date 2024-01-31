package sec11.exam01_jmenu;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class JMenuExample1 extends JFrame {
	private JMenuBar jMenuBar;
	private JMenu menuFile, menuNew, menuPage, menuPeonzip, menujungryeol, menuHyogua;
	private JMenuItem menuItemDeleteFile, menuItemNewFolder;
	private JMenuItem menuItemRename, menuItemCopy, menuItemExit;

	public JMenuExample1() {
		this.setTitle("JMenuExample1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJMenuBar());
		this.setSize(300, 200);
	}

	public JMenuBar getJMenuBar() {
		if (jMenuBar == null) {
			jMenuBar = new JMenuBar();

			jMenuBar.add(getMenuFile());
			jMenuBar.add(getMenuPage());
			jMenuBar.add(getMenuPeonzip());
			jMenuBar.add(getMenujungryeol());
			jMenuBar.add(getMenuHyogua());

		}
		return jMenuBar;
	}

	public JMenu getMenuFile() {
		if (menuFile == null) {
			menuFile = new JMenu("프로젝트");

			menuFile.add(getMenuMenuItemRename());
			menuFile.add(getMenuItemCopy());
			menuFile.add(getMenuNew());
			menuFile.add(new JSeparator());
			menuFile.add(getMenuItemExit());
			menuFile.add(getMenuItemExit());
			menuFile.add(getMenuItemExit());
			menuFile.add(new JSeparator());
			menuFile.add(getMenuItemExit());
		}
		return menuFile;
	}

	public JMenu getMenuPage() {
		if (menuPage == null) {
			menuPage = new JMenu("페이지");
		}
		return menuPage;
	}

	public JMenu getMenuPeonzip() {
		if (menuPeonzip == null) {
			menuPeonzip = new JMenu("편집");
		}
		return menuPeonzip;
	}

	public JMenu getMenujungryeol() {
		if (menujungryeol == null) {
			menujungryeol = new JMenu("정렬");
		}
		return menujungryeol;
	}

	public JMenu getMenuHyogua() {
		if (menuHyogua == null) {
			menuHyogua = new JMenu("효과");
		}
		return menuHyogua;
	}

	public JMenu getMenuNew() {
		if (menuNew == null) {
			menuNew = new JMenu("삭제하기");

			menuNew.add(getMenuItemDeleteFile());

		}
		return menuNew;
	}

	public JMenuItem getMenuItemDeleteFile() {
		if (menuItemDeleteFile == null) {
			menuItemDeleteFile = new JMenuItem("이 프로젝트를 삭제");
		}
		return menuItemDeleteFile;
	}

	public JMenuItem getMenuMenuItemRename() {
		if (menuItemRename == null) {
			menuItemRename = new JMenuItem("이름바꾸기");
		}
		return menuItemRename;
	}

	public JMenuItem getMenuItemCopy() {
		if (menuItemCopy == null) {
			menuItemCopy = new JMenuItem("사본만들기");
		}
		return menuItemCopy;
	}
	public JMenuItem getMenuItemCopy() {
		if (menuItemCopy == null) {
			menuItemCopy = new JMenuItem("사본만들기");
		}
		return menuItemCopy;
	}
	
	
	public JMenuItem getMenuItemExit() {
		if (menuItemExit == null) {
			menuItemExit = new JMenuItem("닫기");
		}
		return menuItemExit;
	}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JMenuExample1 jFrame = new JMenuExample1();
				jFrame.setVisible(true);
			}
		});
	}
}