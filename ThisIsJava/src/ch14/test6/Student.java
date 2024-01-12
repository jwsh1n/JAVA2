package ch14.test6;

import java.util.Scanner;

public class Student {
	// 객체 변수들
	String name; // 이름
	int quizScore; // 퀴즈 점수
	int midtermScore; // 중간시험 점수
	int finalScore; // 기말시험 점수

	// 생성자메소드: 학생의 이름을 넘겨 받아 객체를 생성한다
	public Student(String studentName) {
		// 여기에 코드를 삽입하세요
		this.name = studentName;
		this.quizScore = quizScore;
		this.midtermScore = midtermScore;
		this.finalScore = finalScore;
	}

	// 학생의 이름을 반환한다
	public String getName() {
		return name;
	}

	// 학생의 퀴즈 점수를 반환한다
	public int getQuizScore() {
		// 여기에 코드를 삽입하세요
		return quizScore;
	}

	// 학생의 중간시험 점수를 반환한다
	public int getMidtermScore() {
		// 여기에 코드를 삽입하세요
		return midtermScore;

	}

	// 학생의 기말시험 점수를 반환한다
	public int getFinalScore() {
		// 여기에 코드를 삽입하세요
		return finalScore;
	}

	// 현 Student 객체의 정보에 대한 문자열을 반환한다.
	public String toString() {
		String str = "";
		str = "이름: " + name + "\n";
		str = "퀴즈점수: " + quizScore + "\n";
		str = "중간점수: " + midtermScore + "\n";
		str = "기말점수: " + finalScore + "\n";
		// 여기에 코드를 삽입하세요

		return str;
	}

	// 이름을 주어진 값으로 변경한다
	public void setName(String Name) {
		name = Name;
	}

	// 퀴즈 점수를 주어진 값으로 변경한다
	public void setQuizScore(int QuizScore) {
		// 여기에 코드를 삽입하세요
		this.quizScore = quizScore;
	}

	// 중간시험 점수를 주어진 값으로 변경한다
	public void setMidtermScore(int MidtermScore) {
		// 여기에 코드를 삽입하세요
		this.midtermScore = midtermScore;
	}

	// 기말시험 점수를 주어진 값으로 변경한다
	public void setFinalScore(int FinalScore) {
		// 여기에 코드를 삽입하세요
		this.finalScore = finalScore;
	}

	// 사용자에게 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다.
	// 입력 요청시 이름을 사용한다. 예를 들면, ‘길동의 중간시험 점수를 입력하라.’
	public void inputGrades() {
		Scanner scan = new Scanner(System.in);
		// 여기에 코드를 삽입하세요

		System.out.println(name + "의 퀴즈 점수를 입력하라.");
		quizScore = scan.nextInt();
		while (quizScore < 0 || quizScore > 100) {
			System.out.println("숫자가 범위를 벗어났습니다. 다시 입력해주세요.");
			quizScore = scan.nextInt();
		}

		System.out.println(name + "의 중간시험 점수를 입력하라.");
		midtermScore = scan.nextInt();
		while (midtermScore < 0 || midtermScore > 100) {
			System.out.println("숫자가 범위를 벗어났습니다. 다시 입력해주세요.");
			midtermScore = scan.nextInt();
		}

		System.out.println(name + "의 기말 점수를 입력하라.");
		finalScore = scan.nextInt();
		while (finalScore < 0 || finalScore > 100) {
			System.out.println("숫자가 범위를 벗어났습니다. 다시 입력해주세요.");
			finalScore = scan.nextInt();
		}

	}

	// 학생의 시험 점수들의 총점을 계산하여 반환한다
	public double getTotal() {
		// 여기에 코드를 삽입하세요
		double total = (double) quizScore * 0.2 + (double) midtermScore * 0.3 + (double) finalScore * 0.5;

		return total;
	}

	// 학생의 학점을 반환한다
	// 여기에 메소드를 삽입하세요
	public String getHakjum() {
		String hakjum;
		double total = (double) quizScore * 0.2 + (double) midtermScore * 0.3 + (double) finalScore * 0.5;
		if (total >= 90) {
			hakjum = "A";
		} else if (90 > total && total >= 80) {
			hakjum = "B";
		} else if (80 > total && total >= 70) {
			hakjum = "C";
		} else if (70 > total && total >= 60) {
			hakjum = "D";
		} else {
			hakjum = "F";
		}
		return hakjum;
	}

}