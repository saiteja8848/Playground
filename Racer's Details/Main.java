import java.util.Scanner;
class Racer {
	protected String country;

	public Racer(String country) {
		this.country = country;
	}

	public void displayDetails() {
		System.out.println("Country: " + country);
	}

}

class BikeRacer extends Racer {
	private String racerName;
	private Long age;
	private String racerUsedVehicleName;
	private Long awardsWon;

	public BikeRacer(String country, String racerName, Long age, String racerUsedVehicleName, Long awardsWon) {
		super(country);
		this.racerName = racerName;
		this.age = age;
		this.racerUsedVehicleName = racerUsedVehicleName;
		this.awardsWon = awardsWon;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Racer Name: "+racerName);
		System.out.println("Age of the racer: "+age);
		System.out.println("Vehical Name: "+racerUsedVehicleName);
		System.out.println("Number of awards: "+awardsWon);
	}

}

class CarRacer extends Racer {
	private String racerName;
	private long age;
	private String racerUsedVehicleName;
	private long awardsWon;

	public CarRacer(String country, String racerName, long age, String racerUsedVehicleName, long awardsWon) {
		super(country);
		this.racerName = racerName;
		this.age = age;
		this.racerUsedVehicleName = racerUsedVehicleName;
		this.awardsWon = awardsWon;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Racer Name: "+racerName);
		System.out.println("Age of the racer: "+age);
		System.out.println("Vehical Name: "+racerUsedVehicleName);
		System.out.println("Number of awards: "+awardsWon);
	}

}

public class Main {

	public static void main(String args[]) {

		try {

			Scanner input = new Scanner(System.in);
			String countryName = input.nextLine();
			int choice = input.nextInt();
			input.nextLine();
			String racerName =input.nextLine();
			long age =input.nextLong();
			  input.nextLine();
			String vechicle =input.nextLine();
			long awards = input.nextLong();
			
			
			if (choice == 1) {
               Racer r = new BikeRacer(countryName,racerName,age,vechicle,awards);
               r.displayDetails();
			} else if (choice == 2) {
				Racer r = new CarRacer(countryName,racerName,age,vechicle,awards);
	               r.displayDetails();
			} 
			else
				System.out.println("Invalid Input");

			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

	}
}