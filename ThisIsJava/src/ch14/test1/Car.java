package ch14.test1;

public class Car extends Vehicle {
	private int dis;

	public Car(String model, int price, int dis) {

		super(model, price);

		// 승용차의 배기량에 대한 객체 변수를 선언한다
		this.dis = dis;
	}

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		
	}

	// 승용차의 모델명, 가격과 배기량을 주어진 값으로 초기화하면서
	// 객체를 생성한다
	// 여기에 메소드를 입력하세요

	// 승용차의 배기량을 반환한다
	// 여기에 메소드를 입력하세요

	// 승용차의 세금을 계산한다
	// 여기에 메소드를 입력하세요

	// 승용차의 모델명, 가격과 배기량을 반환한다
	// 여기에 메소드를 입력하세요

	// 승용차의 배기량을 주어진 값으로 변경한다

	// 여기에 메소드를 입력하세요

}
