import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int second =0;
      while(n>=100)
      {
        n/=10;
      }
      second=n%10;
      System.out.println(second);
	}
}