import java.util.Scanner;
class Main{
    static int sum(int n)
    {
      int k=0;
      for(int i=1;i<=n;i++)
        k=k+i;
      return k;
    }
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      System.out.println(sum(n));
	}
}