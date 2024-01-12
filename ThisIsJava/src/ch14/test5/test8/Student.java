package ch14.test8;

public class Student {

	public int number; // 학번
	public String name; // 이름

	// -------------------------------------------------------
	// 변수들을 주어진 값들로 초기화하면서 새 Student 객체를 생성한다.
	// -------------------------------------------------------
	public Student(int Number, String Name) {
		// 여기에 코드를 입력하세요
		this.number = number;
		this.name = name;
	}

	// -------------------------------------------------------
	// 현 Student 객체의 모든 데이터를 문자열로 반환한다.
	// -------------------------------------------------------
	public String toString() {
		// 여기에 코드를 입력하세요
		String str = "";
		str = "학번: " + number + "\n";
		str = "이름: " + name + "\n";

		return str;
	}

}
