import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=0;
    while(n!=0)
    {
      x=(x*10)+n%10;
      n=n/10;
    }
    System.out.println(x);    
  }
}