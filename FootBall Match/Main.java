import java.util.Scanner;
class FootBallMatch{	
	public void displayFootballMatchDate(String matchDate) {
		
		String[] date = matchDate.split("/");
		String day = date[0];
		String month=date[1];
		String year=date[2];
		String DATE=month+"-"+day+"-"+year;
		System.out.println("Match Date: "+DATE);
				
	}
	
	public void displayFootballMatchDetails(String venue) {
		String[] details=venue.split(",");
      System.out.println("Match Venue:");
		System.out.println("Stadium: "+details[0]);
		System.out.println("Country:"+details[1]);
	}
	
	public void displayFootballMatchDetails(String winnerTeam, long goals) {
      System.out.println("Match Outcome: "+ winnerTeam +" won by "+goals+" goals");
	}
	
	
}


public class Main {

	public static void main(String args[]) {

		try {
		
			Scanner input = new Scanner(System.in);
             int choice = input.nextInt();
              input.nextLine();
             if(choice==1) {
            	 String matchDate = input.nextLine();
            	 new FootBallMatch().displayFootballMatchDate(matchDate);
             }
             else if(choice==2)
             {
            	 String venue = input.nextLine(); 
              new FootBallMatch().displayFootballMatchDetails(venue);
             }
             else if(choice==3)
            	 {
            		 String winnerTeam = input.nextLine();
            		 long goals = input.nextLong();
            		 new FootBallMatch().displayFootballMatchDetails(winnerTeam, goals);
            	 }
             else
            	 System.out.println("Invalid Input");
			
			
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

	}
}