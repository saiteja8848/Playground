import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Movie {
	private String name;
	private float rating;
	private int releasedYear;

	public Movie(String name, float rating, int releasedYear) {
		this.name = name;
		this.rating = rating;
		this.releasedYear = releasedYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

}

class Sorting implements Comparator<Movie> {
	public int compare(Movie a, Movie b) {
		return a.getName().compareTo(b.getName());
	}
}

public class Main {
	public static void main(String[] args) {

		Sorting king = new Sorting();
		List<Movie> list = new ArrayList<>();;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n <= 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		for (int i = 0; i < n; i++) {
			input.nextLine();
			String name = input.nextLine();
			float rating = input.nextFloat();
			int year = input.nextInt();
			list.add(new Movie(name, rating, year));
		}
		Collections.sort(list,king);
		
		System.out.println("Sort by Name:");
		for (Movie s : list) {
			System.out.println(s.getName() + " " + s.getReleasedYear() + " " + s.getRating());
		}

	}
}