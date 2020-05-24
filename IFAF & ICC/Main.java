// import the respective packages


import java.util.Scanner;

interface IPlayerStatistics {
	public void displayPlayerStatistics();
}

abstract class Player {
	protected String name;
	protected String teamName;
	protected int noOfMatches;

	public Player(String name, String teamName, int noOfMatches) {
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}

}

class CricketPlayer extends Player implements IPlayerStatistics {
	private int totalRunsScored;
	private int noOfWickets;

	public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWickets = noOfWickets;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player name: " + super.name);
		System.out.println("Team name: " + super.teamName);
		System.out.println("No of matches played: " + super.noOfMatches);
		System.out.println("Total runs scored: " + totalRunsScored);
		System.out.println("No of wickets taken: " + noOfWickets);

	}
}

class FootballPlayer extends Player implements IPlayerStatistics {

	private int noOfGoals;

	public FootballPlayer(String name, String teamName, int noOfMatches, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.noOfGoals = noOfGoals;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player name: " + super.name);
		System.out.println("Team name: " + super.teamName);
		System.out.println("No of matches played: " + super.noOfMatches);
		System.out.println("Total goals scored: " + noOfGoals);
	}

}

public class Main {
	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			if (n <= 0) {
				System.out.println("Invalid Input");
				System.exit(0);
			}
			input.nextLine();
			String name = input.nextLine();
			String teamName = input.nextLine();
			int Matches = input.nextInt();
			if (n == 1) {
				int totalRunsScored = input.nextInt();
				int noOfWickets = input.nextInt();
				IPlayerStatistics player = new CricketPlayer(name, teamName, Matches, totalRunsScored, noOfWickets);
				player.displayPlayerStatistics();
			} else if (n == 2) {
				int noOfGoals = input.nextInt();
				IPlayerStatistics player = new FootballPlayer(name, teamName, Matches, noOfGoals);
				player.displayPlayerStatistics();
			}

		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

	}
}