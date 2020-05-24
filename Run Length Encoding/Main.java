// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;
public class Main{
  public static void printRLE(String str) 
{ 
    int n = str.length(); 
    for (int i = 0; i < n; i++) {   
        int count = 1; 
        while (i < n - 1 &&  str.charAt(i) == str.charAt(i + 1)) { 
            count++; 
            i++; 
        }
      if(count>1)
      {System.out.print(count); 
        System.out.print(str.charAt(i));}
      else
        System.out.print(str.charAt(i));
       
    } 
} 



  
  
  
  public static void main(String[] args){
    //Try out your code here!...
    Scanner input = new Scanner(System.in);
    String text = input.nextLine();
 
    printRLE(text); 

  }
}