import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int last=n%10;
      int first=0;
      while(n!=0)
      {
        first=n%10;
        n/=10;
      }
      
      System.out.println(last+first);
	}
}