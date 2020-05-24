import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      System.out.println(fun(n));
    }
  public static int fun(int n)
  {
    if(n==0)
      return 1;
    else
      return n*fun(n-1);
  }
  
}