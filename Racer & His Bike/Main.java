import java.util.Scanner;

class BasicInfoOfBike {
	protected String model;
	protected Long mileage;

	public BasicInfoOfBike(String model, Long mileage) {
		this.model = model;
		this.mileage = mileage;
	}

	public void displayDetails() {
		System.out.println("Bike Details:");
		System.out.println("Bike model: " + model);
		System.out.println("Mileage: " + mileage + " km/l");
	}
}

class AdvancedInfoOfBike extends BasicInfoOfBike {
	private String bikeOwnedBy;
	private String color;
	private String bikeNumber;

	public AdvancedInfoOfBike(String model, Long mileage, String bikeOwnedBy, String color, String bikeNumber) {
		super(model, mileage);
		this.bikeOwnedBy = bikeOwnedBy;
		this.color = color;
		this.bikeNumber = bikeNumber;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Company name: " + bikeOwnedBy);
		System.out.println("Bike color: " + color);
		System.out.println("Bike Number: " + bikeNumber);
	}

}

public class Main {

	public static void main(String args[]) {

		try {

			Scanner input = new Scanner(System.in);

			String model = input.nextLine();
			long mileage = input.nextInt();
			input.nextLine();
			String company = input.nextLine();
			String color = input.nextLine();
			String bikeNumber = input.nextLine();
			BasicInfoOfBike b = new AdvancedInfoOfBike(model, mileage, company, color, bikeNumber);
            b.displayDetails();
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

	}
}