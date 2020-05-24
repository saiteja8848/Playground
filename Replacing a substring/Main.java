import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner s =new Scanner(System.in);
      String str=s.nextLine();
      String sub =s.nextLine();
      String rep=s.nextLine();
      String news =str.replace(sub,rep);
      System.out.println(news);
    }
}