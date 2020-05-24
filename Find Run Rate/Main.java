// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;

abstract class Match {
	protected int currentScore;
	protected float currentOver;
	protected int target;

	public Match(int currentScore, float currentOver, int target) {
		this.currentScore = currentScore;
		this.currentOver = currentOver;
		this.target = target;
	}

	abstract float calculateRunrate();

	abstract int calculateBalls();
    abstract void display();
}

class ODIMatch extends Match {
	private int totalNumberOfOvers = 50;

	public ODIMatch(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
	}

	float calculateRunrate() {
		int requiredRuns = (super.target - super.currentScore);
		int ballsLeft = calculateBalls();
		float r = ((float)requiredRuns / (float)ballsLeft);
		return (float) ( r * 6);
	}

	int calculateBalls() {
		int ballsCompleted = (int) super.currentOver;
		return ((totalNumberOfOvers * 6) - (ballsCompleted * 6));
	}

	void display() {
		System.out.println("Requirements:");
		System.out.println("Need " + (super.target - super.currentScore) +" Runs in " +calculateBalls() + " balls");
		String rounded = String.format("%.2f",calculateRunrate());
		System.out.println("Required Run Rate- " + rounded);
	}

}

class T20Match extends Match {
	private int totalNumberOfOvers = 20;
	public T20Match(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
	}
	
	float calculateRunrate() {
		int requiredRuns = (super.target - super.currentScore);
		int ballsLeft = calculateBalls();
		float r = ((float)requiredRuns / (float)ballsLeft);
		return (float) ( r * 6);
	}

	int calculateBalls() {
		int ballsCompleted = (int) super.currentOver;
		return ((totalNumberOfOvers * 6) - (ballsCompleted * 6));
	}

	void display() {
		System.out.println("Requirements:");
		System.out.println("Need " + (super.target - super.currentScore) +" Runs in " +calculateBalls() + " balls");
		String rounded = String.format("%.2f",calculateRunrate());
		System.out.println("Required Run Rate- " + rounded);
	}

	
}

class TestMatch extends Match {
	private int totalNumberOfOvers = 90;
	public TestMatch(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
	}
	float calculateRunrate() {
		int requiredRuns = (super.target - super.currentScore);
		int ballsLeft = calculateBalls();
		float r = ((float)requiredRuns / (float)ballsLeft);
		return (float) ( r * 6);
	}

	int calculateBalls() {
		int ballsCompleted = (int) super.currentOver;
		return ((totalNumberOfOvers * 6) - (ballsCompleted * 6));
	}

	void display() {
		System.out.println("Requirements:");
		System.out.println("Need " + (super.target - super.currentScore) +" Runs in " +calculateBalls() + " balls");
		String rounded = String.format("%.2f",calculateRunrate());
		System.out.println("Required Run Rate- " + rounded);
	}

	
}

public class Main{
  public static void main(String[] args){
    try {
			Match match = null;
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			int currentScore = input.nextInt();
			int currentOver = input.nextInt();
			int targetScore = input.nextInt();

			if (choice == 1) {               
				match= new ODIMatch(currentScore,currentOver, targetScore);
				match.display();
			} else if (choice == 2) {
				match= new T20Match(currentScore,currentOver, targetScore);
				match.display();
			} else if (choice == 3) {
				match= new TestMatch(currentScore,currentOver, targetScore);
				match.display();
			} else
				System.out.println("Invalid Input");

			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

  }
}