// import the respective packages
import java.util.*;
public class Main{
  public static void main(String[] args){
    //Try out your code here
     TreeSet<String> set = new TreeSet<>();
    try{
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
        input.nextLine();
      for(int i=0;i<a;i++){
       String str = input.nextLine();
        set.add(str);
      }
       Iterator<String> i=set.iterator();  
           while(i.hasNext())  {  
           System.out.println(i.next());  
           }  
      
      
      
      
    }catch(Exception e){
    System.out.println("Invalid Input");
    }
    
    
  }
}