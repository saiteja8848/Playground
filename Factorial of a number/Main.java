import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner  s=new Scanner(System.in);
       int n=s.nextInt();
      int p=1,i=1;
      while(i<=n)
      {
        p=p*i;
        i++;
      }
      System.out.println(p);
	}
}