import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Match implements Comparable<Match> {

	private String date;
	private String teamOne;
	private String teamTwo;

	public Match(String date, String teamOne, String teamTwo) {
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public int compareTo(Match m) {
		String date1 = this.getDate();
		String date2 = m.getDate();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate localDate1 = LocalDate.parse(date1, dateTimeFormatter);
		LocalDate localDate2 = LocalDate.parse(date2, dateTimeFormatter);
		boolean st = localDate1.isAfter(localDate2);
		if (st)
			return -1;
		else
			return 1;
	}

}

public class Main {
	public static void main(String[] args) {
		  List<Match> list = new ArrayList<>();
		  Scanner input = new Scanner(System.in);
		  int n = input.nextInt();  
		  if (n <= 0) {System.out.println("Invalid Input"); System.exit(0); } 
	  input.nextLine();	 
      for (int i = 0; i < n;i++) 
		  { String date = input.nextLine();
		  String team1 = input.nextLine();
		  String team2 = input.nextLine(); 
		  list.add(new Match(date, team1,team2)); 
		  }
		  
		  Collections.sort(list);
		  
		  System.out.println("Match Details"); for (Match s : list) {
		  System.out.println("Team 1 "+s.getTeamOne());
		  System.out.println("Team 2 "+s.getTeamTwo());
		  System.out.println("Match held on "+s.getDate()); }
		 
		
		
		/*
		 * String date1 ="09-31-2016"; String date2 = "07-31-2016"; DateTimeFormatter
		 * dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy"); LocalDate
		 * localDate1 = LocalDate.parse(date1, dateTimeFormatter); LocalDate localDate2
		 * = LocalDate.parse(date2, dateTimeFormatter); boolean
		 * st=localDate1.isAfter(localDate2); System.out.println(st);
		 */
		

	}
}