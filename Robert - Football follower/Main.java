// import the respective packages
import java.util.*;
public class Main{
  public static void main(String[] args){
    //Try out your code here
   try{
		     Map<Integer,String> map1 = new HashMap<>();
		     Map<Integer,String> map2 = new HashMap<>();
		    Scanner input = new Scanner(System.in);
		     int a = input.nextInt();
		     for(int i=0;i<a;i++){
		      int id = input.nextInt();
		          input.nextLine();
		      String name = input.nextLine();
		       map1.put(id,name);
		     }
		      a = input.nextInt();
		     for(int i=0;i<a;i++){
		      int id = input.nextInt();
		          input.nextLine();
		      String name = input.nextLine();
		       map2.put(id,name);
		     }     
		     System.out.println("Equality: "+map1.equals(map2));
		   }catch(Exception e){
		   System.out.println("Invalid Input");
		   }

    
  }
}