package ch14.test2;

public abstract class TaxPayer {
	protected String name; // 이름
	protected int number; // 번호

	// 납세자의 이름과 번호를 주어진 값으로 초기화한다
	public TaxPayer(String name, int number) {
		this.name = name;
		this.number = number;
	}

	// 납세자의 이름을 반환한다
	public String getName() {
		return name;
	}

	// 납세자의 번호를 반환한다
	// 여기에 메소드를 입력하세요
	public int getNumber() {
		return number;
	}

	// 납세자의 이름과 번호를 반환한다
	// 여기에 메소드를 입력하세요
	public String toString() {
		return "이름: " + name + ", 번호: " + number;
	}

	// 납세자의 이름을 주어진 값으로 변경한다
	private void setName(String name) {
		this.name = name;
	}

	// 납세자의 번호를 주어진 값으로 변경한다
	// 여기에 메소드를 입력하세요
	private void setNumber(int number) {
		this.number = number;
	}

	// 납세자의 세금을 계산한다
	// 여기에 메소드를 입력하세요
	abstract void tax();

}