// import the respective packages
import java.util.Scanner;
interface PrimeFactors{
	abstract void factors(int number);
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    try {
			Scanner input = new Scanner(System.in);
			int number =input.nextInt();
			if(number<=0)
				throw new Exception("Invalid Input");
			else
			{
				PrimeFactors f ;
				f=(int n)->{
					while (n%2==0) { 
			            System.out.print(2 + " "); 
			            n /= 2; 
			        } 
			 
			        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
			        {  
			            while (n%i == 0) 
			            { 
			                System.out.print(i + " "); 
			                n /= i; 
			            } 
			        } 
			   
			        if (n > 2) 
			            System.out.print(n); 
				};
				f.factors(number);
			}
			
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
  }
}