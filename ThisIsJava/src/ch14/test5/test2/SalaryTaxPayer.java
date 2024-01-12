package ch14.test2;

public class SalaryTaxPayer extends TaxPayer {
	private int salary; // 월급

	// 근로소득자의 이름, 번호와 월급을 주어진 값으로 초기화한다
	public SalaryTaxPayer(String name, int number, int salary) {
		super(name, number);
		this.salary = salary;
	}

	// 근로소득자의 월급을 반환한다
	// 여기에 메소드를 입력하세요
	public int getSalary() {
		return salary;
	}

	// 근로소득자의 이름, 번호와 월급을 반환한다
	@Override
	public String toString() {
		return super.toString() + ", 월급: " + salary;
	}

	// 근로소득자의 월급을 주어진 값으로 변경한다
	// 여기에 메소드를 입력하세요
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 근로소득자의 세금을 계산한다

	public double computeTax() {
		double tax = 0;
		if (salary * 12 > 80000000) {
			tax = salary * (double) (12 * 0.3);
		} else if (salary * 12 > 60000000 && salary * 12 <= 80000000) {
			tax = salary * (double) (12 * 0.2);
		} else if (salary * 12 > 40000000 && salary * 12 <= 60000000) {
			tax = salary * (double) (12 * 0.15);
		} else if (salary * 12 > 20000000 && salary * 12 <= 40000000) {
			tax = salary * (double) (12 * 0.1);
		} else {
			tax = salary * (double) (12 * 0.05);
		}
		return tax;
	}

	@Override
	void tax() {
		// TODO Auto-generated method stub

	}
}