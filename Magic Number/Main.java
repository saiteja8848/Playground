// import the respective packages
import java.util.Scanner;
interface MagicNumber{
	abstract void check(int number);
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
				MagicNumber f ;
				f=(int n)->{
					boolean status=true;
					int x=n;
					while(status) {
					int sum=0;
					while(n!=0) {
						sum+=n%10;
						n/=10;
					}
				
				  n=sum;
				  if(n>=1&&n<=9)
					  status=false;
				 }
					if(n==1)
					System.out.println(x+" is a Magic Number.");
					else
					  System.out.println(x+" is not a Magic Number.");	
				};
				f.check(number);
			}
			
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

  }
}