// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    try{
      Scanner input = new Scanner(System.in);
      String str = input.nextLine();
      int len =str.length();
       if(len%2==0){
         System.out.println(str.charAt(0)+""+str.charAt((len/2)-1)+""+str.charAt(len/2)+""+str.charAt(len-1));
       }
      else
        	System.out.println(str.charAt(0)+""+str.charAt(len/2)+""+str.charAt(len-1));
                           
    }catch(Exception e){System.out.println("Invalid Input");}
  }
}