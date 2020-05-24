// import the respective packages
import java.util.Scanner;
import java.io.*; 
public class Main{
  public static void main (String[] args){
    //Try out your code here
    
	  try {
        Scanner input = new Scanner(System.in);
        String fileName=input.nextLine();
      File myObj = new File(fileName);
      if (myObj.createNewFile()) {
        System.out.println("File created");
      } else {
        System.out.println("File already exists");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
	    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}