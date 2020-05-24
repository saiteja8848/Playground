import java.util.Scanner;
class Main{
  static int larger(int a,int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
         int x=larger(a,b);
        System.out.println(larger(x,c));
	}
}