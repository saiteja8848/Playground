import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=n;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i==j||j==k)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        k--;
        System.out.println();
        
      }
      
	}
}