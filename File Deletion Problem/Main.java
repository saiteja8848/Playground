// import the respective packages
import java.util.Scanner;
import java.io.*;

public class Main{
  public static void main (String[] args){
    //Try out your code here
    try{
      Scanner input = new Scanner(System.in);
       String fileName = input.nextLine();
      File myObj = new File(fileName); 
    if (myObj.delete()) { 
      System.out.println("File deleted");
    } else {
      System.out.println("File was not deleted");
    } 
      
    }catch(Exception e){
    System.out.println("An error Occured");
    }
    
    
    
  }
}