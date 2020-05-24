// import the respective packages
import java.util.Scanner;

interface factorial{
	abstract void fact(int number,int p);
}
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    
		try {
			Scanner input = new Scanner(System.in);
			int number =input.nextInt();
			if(number<0)
				throw new Exception("Invalid Input");
			else
			{
				factorial f ;
				f=(int n,int p)->{
					if(n==0)
						System.out.println(1);
					else
					{p=1;
					for(int i=1;i<=n;i++)
						p*=i;
						System.out.println(p);}
				};
				f.fact(number, 1);
			}
			
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}

  }
}