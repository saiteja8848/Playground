// import the respective packages
import java.util.Scanner;

interface WordCount{
	abstract void count(String phrase,String word);
}

public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    try {
			Scanner input = new Scanner(System.in);
			String p =input.nextLine();
			String w = input.nextLine();
			

				WordCount f ;
				f=(String ph,String wo)->{
					int sum=0;
					String[] data = ph.split(" ");
					for(int i=0;i<data.length;i++) {
						if(data[i].equalsIgnoreCase(wo)) {
							sum+=1;
						}
					}
					System.out.println(wo+" - "+sum);			
				};
				f.count(p,w);
			
			
			input.close();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
  }
}