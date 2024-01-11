package ch14.test1;

public abstract class Vehicle {
	// 차량의 모델명과 가격에 대한 객체 변수를 선언한다
	public String model;
	public int price;

	// 차량의 모델명과 가격을 주어진 값으로 초기화하면서
	// 객체를 생성한다
	public Vehicle(String model, int price) {

		this.model = model;
		this.price = price;
	}

	// 차량의 모델을 반환한다

	public String getModel() {
		return this.model;
	}

	// 차량의 가격을 반환한다
	public int getPrice() {
		return this.price;
	}

	// 차량의 모델명과 가격을 반환한다
	public String toString() {
		return model + "," + price;
	}

	// 차량의 세금을 계산한다
	public abstract void tax();

// 차량의 모델을 주어진 값으로 변경한다
	public void setModel(String model) {
		this.model = model;
	}

// 차량의 가격을 주어진 값으로 변경한다
	public void setPrice(int price) {
		this.price = price;
	}
}
