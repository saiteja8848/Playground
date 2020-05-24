// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main (String[] args){
   
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String word = input.nextLine();
	    int count=0;
	    String[] words = sentence.split(" ");
	    
	    for(int i=0;i<words.length;i++){
	    if(words[i].equalsIgnoreCase(word))
	    { count++;}
	  }
	    System.out.println(count);
  }
}