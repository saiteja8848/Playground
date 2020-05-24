// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    try{
    Scanner input = new Scanner(System.in);
    int n =input.nextInt();
    if(n<=0)
    {System.out.println("Invalid Input");System.exit(0);}
      input.nextLine();
      String[] data  = new String[n];
      for(int i =0;i<n;i++)
      {  data[i]=input.nextLine();
      System.out.println(data[i].trim());
      }
      
    }catch(Exception e){
    System.out.println("Invalid Input");
    }
    
  }
}