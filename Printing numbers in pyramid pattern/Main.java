import java.util.Scanner;
 class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=1;
      for(int i=1;i<=n;i++)
      {
        for(int s1=1;s1<=n-i;s1++)
        {System.out.print(" ");}
        for(int j=1;j<=i;j++)
        {System.out.print(k+" ");k++;}
        System.out.println();
      }
      
	}
}