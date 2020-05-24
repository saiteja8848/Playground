import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      switch(n)
      {
        case 1:
           int a=s.nextInt();
          System.out.println(a*a);
          break;
        case 2:
           int l=s.nextInt();
           int b=s.nextInt();
          System.out.println(l*b);
          break;
        case 3:
          int x=s.nextInt();
           int y=s.nextInt();
          System.out.println((x*y)/2);
          break;
        case 4:
          float r=s.nextFloat();
          System.out.printf("%s",(3.14*r*r));
          break;
      }
      
      
    }
}