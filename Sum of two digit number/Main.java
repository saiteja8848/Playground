import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int x=n%10;
      n/=10;
      int y=n%10;
      System.out.println(x+y);
	}
}