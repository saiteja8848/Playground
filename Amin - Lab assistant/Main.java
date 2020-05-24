// import the respective packages
import java.util.*;
public class Main{
  public static void main(String[] args){
    //Try out your code here
    TreeSet<String> set1 = new TreeSet<>();
    TreeSet<String> set2 = new TreeSet<>();
    try{
    Scanner input = new Scanner(System.in);
      int a = input.nextInt();
        input.nextLine();
      for(int i=0;i<a;i++){
       String str = input.nextLine();
        set1.add(str);
      }
       int b = input.nextInt();
        input.nextLine();
      for(int i=0;i<b;i++){
       String str = input.nextLine();
        set2.add(str);
      }
      if(a>0&&b>0){
      System.out.println("Chemical Set 1");
       Iterator<String> i=set1.iterator();  
           while(i.hasNext())  {  
           System.out.println(i.next());  
           }  
      System.out.println();
         System.out.println("Chemical Set 2");
      i=set2.iterator();  
           while(i.hasNext())  {  
           System.out.println(i.next());  
           }  
      
      }
      else
        System.out.println("Invalid Input");
      
    }catch(Exception e ){
    System.out.println("Invalid Input");
    }
    
    
  }
}