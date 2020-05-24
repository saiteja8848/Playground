import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
      String s3=s1+s1;
      if(s3.contains(s2))
      System.out.println("Yes");
      else
      System.out.println("No");
    
      
      
      
    }
}