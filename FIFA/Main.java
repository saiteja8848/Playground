// import the respective packages
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    if(n<=0){System.out.println("Invalid Input");System.exit(0);}
    Map map = new HashMap();
    for(int i=1;i<=n;i++){
    int jerseyNumber = input.nextInt();
    input.nextLine();
    String name = input.nextLine();
    map.put(jerseyNumber,name);  
    } 
    ArrayList<Integer> keyList = new ArrayList<Integer>(map.keySet());
    System.out.println(keyList);
  }
}