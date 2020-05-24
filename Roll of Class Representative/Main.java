// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    String[] data = str.split(",");
    for(int i=0;i<data.length;i++)
       System.out.println(data[i].trim());
    
  }
}