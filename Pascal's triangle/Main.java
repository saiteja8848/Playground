// import the respective packages
import java.util.Scanner;

interface PascalTriangle{
	abstract void print(int number);
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    	try {
			Scanner input = new Scanner(System.in);
		    int number = input.nextInt();

				PascalTriangle f ;
				f=(int n)->{
					if(n<=0)
						System.out.println("Invalid Input");
					else
					for (int line = 0; line < n; line++) { 
				        for (int i = 0; i <= line; i++) 
				        {
				        	int res = 1; 
				            int k=i;
				            if (k > line - k) 
				            k = line - k; 
				                  
				            for (int j = 0; j < k; ++j) 
				            { 
				                res *= (line - j); 
				                res /= (j + 1); 
				            } 
				        	System.out.print(res+" ");	
				        }                     
				        System.out.println(); 
				    } 				
				};
				f.print(number);			
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

  }
}