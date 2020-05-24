import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String nstr=s.nextLine();
      int n=s.nextInt();
      String arg[]=nstr.split(" ",n);
      for(String a:arg)
        System.out.println(a);
    }
}