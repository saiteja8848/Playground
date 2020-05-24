import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
  public static boolean isPrime(int num){
   boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
  }
  public static void main(String[] args){
   try{
    int count=0;
    List<Integer> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    if(n<=0){System.out.println("Invalid Input");
            System.exit(0);
            }
   for(int i=0;i<n;i++){
     int x = input.nextInt();
     if(isPrime(x))
       count++;
   }
   System.out.println("Number of prime marks: "+count); 
   }catch(Exception e ){
   System.out.println("Invalid Input");
   }
  
  }
}