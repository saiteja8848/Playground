import java.util.Scanner;

interface IPlayerStatistics {
	public void displayPlayerStatistics();
}

class CricketPlayer {
	protected String name;
	protected String teamName;
	protected int noOfMatches;

	public CricketPlayer(String name, String teamName, int noOfMatches) {
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}

}

class Bowler extends CricketPlayer implements IPlayerStatistics {

	private int noOfWickets;

	public Bowler(String name, String teamName, int noOfMatches, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player Name: " + super.name);
		System.out.println("Team Name: " + super.teamName);
		System.out.println("No of matches: " + super.noOfMatches);
		System.out.println("No of wickets taken: " + noOfWickets);

	}
}

class Batsman extends CricketPlayer implements IPlayerStatistics {
	private int noOfRunsScored;

	public Batsman(String name, String teamName, int noOfMatches, int noOfRunsScored) {
		super(name, teamName, noOfMatches);
		this.noOfRunsScored = noOfRunsScored;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player Name: " + super.name);
		System.out.println("Team Name: " + super.teamName);
		System.out.println("No of matches: " + super.noOfMatches);
		System.out.println("Total runs scored: " + noOfRunsScored);

	}
}

class WicketKeeper extends CricketPlayer implements IPlayerStatistics {
	private int noOfCatches;
	private int noOfStumpings;
	private int runs;
	private int noOfDismissals;

	
	public WicketKeeper(String name, String teamName, int noOfMatches, int noOfCatches, int noOfStumpings, int runs,int noOfDismissals) {
		super(name, teamName, noOfMatches);
		this.noOfCatches = noOfCatches;
		this.noOfStumpings = noOfStumpings;
		this.runs = runs;
		this.noOfDismissals = noOfDismissals;
	}


	public void displayPlayerStatistics() {

		System.out.println("Player Name: " + super.name);
		System.out.println("Team Name: " + super.teamName);
		System.out.println("No of matches: " + super.noOfMatches);
		System.out.println("No of catches: " + noOfCatches);
		System.out.println("No of stumpings: " + noOfStumpings);
		System.out.println("No of dismissals: " + runs);
		System.out.println("Total runs scored: " + noOfDismissals);

	}

}

class AllRounder extends CricketPlayer implements IPlayerStatistics {
	private int runs;
	private int noOfWickets;

	public AllRounder(String name, String teamName, int noOfMatches, int runs, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player Name: " + super.name);
		System.out.println("Team Name: " + super.teamName);
		System.out.println("No of matches: " + super.noOfMatches);
		System.out.println("Total runs scored: " + runs);
		System.out.println("No of wickets taken: " + noOfWickets);

	}
}

public class Main {
	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			if(n<=0) {System.out.println("Invalid Input");System.exit(0);}
			input.nextLine();
			String name = input.nextLine();
			String team =input.nextLine();
			int matches = input.nextInt();
			if(n==1) {
				int wickets = input.nextInt();
				IPlayerStatistics player = new  Bowler(name,team,matches,wickets);
				player.displayPlayerStatistics();
			}
			else if(n==2) {
					int runsScored = input.nextInt();
					IPlayerStatistics player = new  Batsman(name,team,matches,runsScored);
					player.displayPlayerStatistics();
				}
			else if(n==3) {
					 int noOfCatches = input.nextInt();
					 int noOfStumpings = input.nextInt();
					 int runs = input.nextInt();
				     int noOfDismissals = input.nextInt();
					IPlayerStatistics player = new  WicketKeeper(name,team,matches,noOfCatches,noOfStumpings,runs,noOfDismissals);
					player.displayPlayerStatistics();
				}
			else if(n==4) {
				 int runs = input.nextInt();
				 int noOfWickets = input.nextInt();				
				IPlayerStatistics player = new  AllRounder(name,team,matches,runs,noOfWickets);
				player.displayPlayerStatistics();
			}
			else
				System.out.println("Invalid Input");			
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

	}
}