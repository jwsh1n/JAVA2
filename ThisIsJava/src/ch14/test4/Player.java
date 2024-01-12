package ch14.test4;

public class Player {
	private String name;
	private int total;

	Player(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void roll(PairOfDice dice) {
		int value1, value2;

		dice.roll();

		value1 = dice.getFaceValue1();
		value2 = dice.getFaceValue2();
		total = value1 + value2;
		System.out.println("\t 주사위 1: " + value1 + " 주사위 2: " + value2 + " 점수: " + total);

	}

}
