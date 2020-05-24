import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     int i=0;
      Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int j=1;j<=n;j++)
          i+=j;
      System.out.println(i);
	}
}