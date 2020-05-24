import java.util.Scanner;

class FootballPlayer {

	void displayFootballPlayerDetails(String playerName, String goalKeeperName) {
		System.out.println("Player details of the football:");
		System.out.println("Main Player- " + playerName);
		System.out.println("GoalKeeper- " + goalKeeperName);
	}

	void displayFootballPlayerDetails(Long goals) {
		System.out.println("Number of goals scored in the match: " + goals);
	}

}

public class Main {

	public static void main(String args[]) {

		try {

			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			input.nextLine();
			if (choice == 1) {
				String playerName = input.nextLine();
				String goalKeeperName = input.nextLine();
				new FootballPlayer().displayFootballPlayerDetails(playerName, goalKeeperName);
			} else if (choice == 2) {
				long goals = input.nextLong();
				new FootballPlayer().displayFootballPlayerDetails(goals);
			} else
				System.out.println("Invalid Input");

			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

	}
}