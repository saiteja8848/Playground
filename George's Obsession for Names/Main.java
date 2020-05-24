// import the respective packages
import java.util.Scanner;

public class Main{
  public static void main (String[] args){
    try{
      Scanner input = new Scanner(System.in);
      String str = input.nextLine();
       String nstr = str.toUpperCase();
      for(int i=0;i<nstr.length();i++)
        System.out.println(nstr.charAt(i));
      
    }catch(Exception e){System.out.println("Invalid Input");}
    
  }
}