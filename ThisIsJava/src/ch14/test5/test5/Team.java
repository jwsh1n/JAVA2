package ch14.test5;

public class Team {

	public String teamName;

	private int score;

	public Team(String teamName, int score) {
		this.teamName = teamName;
		this.score = score;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getScore() {
		return score;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String toString() {
		String strToReturn = new String();
		strToReturn = "이름 : " + teamName + "\n" + "점수 : " + score;

		return strToReturn;
	}

	public static void main(String[] args) {

		Team home = new Team("", 0);
		Team visitor = new Team("", 0);

		home.setTeamName("엘지");
		visitor.setTeamName("삼성");

		// 첫 경기의 결과를 기록한다(홈팀이 5대7의 점수로 진다)
		home.setScore(5);
		visitor.setScore(7);

		// 이긴 팀을 찾는다
		if (home.getScore() > visitor.getScore()) {
			System.out.println(home.toString());
			System.out.println(visitor.toString());
			System.out.println(home.getTeamName() + "팀이 이긴다.");

		} else {
			System.out.println(home.toString());
			System.out.println(visitor.toString());
			System.out.println(visitor.getTeamName() + "팀이 이긴다.");
		}

		// 두번째 경기의 결과를 기록한다(홈팀이 9대3의 점수로 이긴다)
		home.setScore(9);
		visitor.setScore(3);

		if (home.getScore() > visitor.getScore()) {
			System.out.println(home.toString());
			System.out.println(visitor.toString());
			System.out.println(home.getTeamName() + "팀이 이긴다.");
		} else {
			System.out.println(home.toString());
			System.out.println(visitor.toString());
			System.out.println(visitor.getTeamName() + "팀이 이긴다.");
		}
	}
}