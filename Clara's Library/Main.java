// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;


abstract class LibraryCard{
	protected String name;
	protected String cardNumber;
	protected String expiryDate;
	public LibraryCard(String name, String cardNumber, String expiryDate) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	abstract public void display();
}

class MembershipCard extends LibraryCard{
	private int  minimumBookToBorrow;

	public MembershipCard(String name, String cardNumber, String expiryDate, int minimumBookToBorrow) {
		super(name, cardNumber, expiryDate);
		this.minimumBookToBorrow = minimumBookToBorrow;
	}

	public int getMinimumBookToBorrow() {
		return minimumBookToBorrow;
	}

	public void setMinimumBookToBorrow(int minimumBookToBorrow) {
		this.minimumBookToBorrow = minimumBookToBorrow;
	}
	
	
	
	public void display() {
		System.out.println(name+" 's Membership Card Details");
		System.out.println("Card Number  "+cardNumber);
		System.out.println("Minimum books to borrow "+minimumBookToBorrow);
		System.out.println("Due date to return the book: 10 days from the book taken");
	}
	
}


class LifeLongMembershipCard extends LibraryCard{
	private int  minimumBookToBorrow;

	public LifeLongMembershipCard(String name, String cardNumber, String expiryDate, int minimumBookToBorrow) {
		super(name, cardNumber, expiryDate);
		this.minimumBookToBorrow = minimumBookToBorrow;
	}

	public int getMinimumBookToBorrow() {
		return minimumBookToBorrow;
	}

	public void setMinimumBookToBorrow(int minimumBookToBorrow) {
		this.minimumBookToBorrow = minimumBookToBorrow;
	}
	
	public void display() {
		System.out.println(name+" 's Membership Card Details");
		System.out.println("Card Number  "+cardNumber);
		System.out.println("Minimum books to borrow "+minimumBookToBorrow);
		System.out.println("Due date to return the book: unlimited");
	}

	
}




public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    try {
			LibraryCard cardDetails=null;
			Scanner input = new Scanner(System.in);
		    int choice = input.nextInt();if(choice==0) {System.out.println("Invalid Input");System.exit(0);}
		    input.nextLine();
		    String details = input.nextLine(); 
		    int minBooks = input.nextInt();
		    String[] data = new String[3];
		    int j=0,startPoint=0;
		    for(int i = 0;i<details.length();i++)
		    {
		    	if(details.charAt(i)=='|')
		    	{data[j++]=details.substring(startPoint, i-1).trim();startPoint = (i+2);}
		    }
		    if(choice ==2) {
		    	cardDetails = new MembershipCard(data[0],data[1],data[2],minBooks);
		    	cardDetails.display();	    	
		    }
		    else if(choice==1) {
		    	cardDetails = new LifeLongMembershipCard(data[0],data[1],data[2],minBooks);	
		    	cardDetails.display();	   
		    }
		    else
		    	System.out.println("Invalid Input");		    
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

    
  }
}