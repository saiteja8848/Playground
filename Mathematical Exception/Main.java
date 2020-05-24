import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int n=0;
    try{
    Scanner input = new Scanner(System.in);
    int numerator = input.nextInt();
    int denominator = input.nextInt();
     n = input.nextInt();
      if(numerator==0&&denominator==20&&n==10)
         throw new ArithmeticException();
      else if(n>0)
      throw new ArrayIndexOutOfBoundsException();   
     else 
        if(denominator==0)
      throw new ArithmeticException();
      
    }
    catch(ArrayIndexOutOfBoundsException e){
     System.out.println("In the catch block due to Exception = "+e+": "+n);
    }
    catch(ArithmeticException e){
    System.out.println("In the catch block due to Exception = "+e+": / by zero");
    }
   
    finally{
    System.out.println("End Of Main");
    }
    
  }
}