package ch14.test4;

public class Driver {

	public static void main(String[] args) {
		String flag ="예";
		PairOfDice dice = new PairOfDice();
		Player player1, player2;
		
		player1 = new Player("홍길동");
		player2 = new Player("이순신");
		
		Scanner scan = new Scanner(System.in)
				
				System.out.println(player1.getName());
		player1.roll(dice);

	}

}
