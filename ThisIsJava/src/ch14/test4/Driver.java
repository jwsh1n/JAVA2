package ch14.test4;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String flag = "예";
		PairOfDice dice = new PairOfDice();
		Player player1, player2;

		player1 = new Player("홍길동");
		player2 = new Player("이순신");

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println(player1.getName());
			player1.roll(dice);

			System.out.println(player2.getName());
			player2.roll(dice);

			if (player1.getTotal() > player2.getTotal()) {
				System.out.println(player1.getName());
			} else if (player2.getTotal() > player1.getTotal()) {
				System.out.println(player2.getName());
			} else {
				System.out.println("비겼습니다.");
			}
			System.out.println("게임을 계속 하시겠습니까?");
			flag = scan.next();
		} while (flag.equals("yes"));

	}

}
