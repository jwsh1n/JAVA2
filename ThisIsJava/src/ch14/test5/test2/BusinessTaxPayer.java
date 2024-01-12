package ch14.test2;

public class BusinessTaxPayer extends TaxPayer {
	private int sales; // 총매출액
	private int expenses; // 총비용

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 주어진 값으로 초기화한다
	public BusinessTaxPayer(String name, int number, int sales, int expenses) {
		// 여기에 코드를 입력하세요
		super(name, number);
		this.sales = sales;
		this.expenses = expenses;
	}

	// 사업소득자의 총매출액을 반환한다
	public int getSales() {
		// 여기에 코드를 입력하세요
		return this.sales;
	}

	// 사업소득자의 총비용을 반환한다
	// 여기에 메소드를 입력하세요
	public int getExpenses() {
		return this.expenses;
	}

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 반환한다
	// 여기에 메소드를 입력하세요
	String toStirng() {
		return super.toString() + ", 총매출액:" + sales + ", 총비용: " + expenses;
	}

	// 사업소득자의 총매출액을 주어진 값으로 변경한다
	private void setSales(int sales) {
		// 여기에 코드를 입력하세요
		this.sales = sales;
	}

	@Override
	void tax() {
		// TODO Auto-generated method stub

	}

	// 사업소득자의 총비용을 주어진 값으로 변경한다
	// 여기에 메소드를 입력하세요
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	// 사업소득자의 세금을 계산한다
	// 여기에 메소드를 입력하세요
	public 
	
}