import java.util.Scanner;

interface IPlayerStatistics {
	public void displayPlayerStatistics();
}

class Player implements IPlayerStatistics {

	private String name;
	private String teamName;
	private int no0fMatches;
	private long totalgoals;

	public Player(String name, String teamName, int no0fMatches, long totalgoals) {
		this.name = name;
		this.teamName = teamName;
		this.no0fMatches = no0fMatches;
		this.totalgoals = totalgoals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNo0fMatches() {
		return no0fMatches;
	}

	public void setNo0fMatches(int no0fMatches) {
		this.no0fMatches = no0fMatches;
	}

	public long getTotalgoals() {
		return totalgoals;
	}

	public void setTotalgoals(long totalgoals) {
		this.totalgoals = totalgoals;
	}

	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player name: "+name);
		System.out.println("Team name: "+teamName);
		System.out.println("No of matches: "+no0fMatches);
		System.out.println("Total goals: "+totalgoals);
	}

}

public class Main {
	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			String a =input.nextLine();
			String b=input.nextLine();
			int c=input.nextInt();
			int d=input.nextInt();
          if(d==0||c==0){
          System.out.println("Invalid Input");
            System.exit(0);
          }
			Player player = new Player(a,b,c,d);
			player.displayPlayerStatistics();
			
		}catch(Exception e) {
			System.out.println("Invalid Input");
		}
		
		
	}
}