// import the respective packages
import java.util.Scanner;
import java.io.File;

public class Main{
  public static void main (String[] args){
    //Try out your code here
    try{
      Scanner input = new Scanner(System.in);
      String oldfileName = input.nextLine();
      String newfileName = input.nextLine();
      File f1 = new File(oldfileName);
       File f2 = new File(newfileName);
        boolean b = f1.renameTo(f2);
      if(b)
       System.out.println("Renamed successfully");
      else
        System.out.println("error");
      
      
      
    }catch(Exception e){
      System.out.println("An error Occured");
    }
    
  }
}