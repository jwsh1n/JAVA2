package test;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class SlideShowPanel extends JPanel {
	private String[] imagePaths; // 이미지 파일 경로 배열
	private int currentIndex = 0; // 현재 이미지 인덱스
	private JLabel imageLabel; // 이미지를 표시하는 레이블

	public SlideShowPanel(String[] imagePaths) {
		this.imagePaths = imagePaths;
		setupUI();
		startSlideShow();
	}

	private void setupUI() {
		setLayout(new BorderLayout());

		imageLabel = new JLabel();
		add(imageLabel, BorderLayout.CENTER);
	}

	private void startSlideShow() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				SwingUtilities.invokeLater(() -> {
					// 이미지 변경
					ImageIcon imageIcon = new ImageIcon(imagePaths[currentIndex]);
					Image image = imageIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
					imageLabel.setIcon(new ImageIcon(image));

					// 다음 이미지 인덱스로 변경
					currentIndex++;
					if (currentIndex >= imagePaths.length) {
						currentIndex = 0; // 마지막 이미지에 도달하면 처음으로 돌아감
					}
				});
			}
		}, 0, 2000); // 2초마다 이미지 변경
	}

	public static void main(String[] args) {
		String[] imagePaths = { "image/loveWinsAll.jpg", "image/nhAd.jpg" };
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Slide Show");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(600, 400);

			SlideShowPanel slideShowPanel = new SlideShowPanel(imagePaths);
			frame.add(slideShowPanel);

			frame.setVisible(true);
		});
	}
}
