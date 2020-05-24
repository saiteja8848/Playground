import java.util.Scanner;
class Main{
  static int gcd(int a,int b)
  {
    int min;
    if(a>b)
      min=b;
    else
      min=a;
    while(true)
    {
      if(a%min==0&&b%min==0)
        return min;
      else
        min++;
    }
  }
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
         int x=gcd(a,b);
        System.out.println(gcd(x,c));
	}
}