import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       StringBuffer sb=new StringBuffer(str);
      sb.reverse();
      String s2=sb.toString();
      if(str.equals(s2))
        System.out.println("Yes");
      else
            System.out.println("No");
    } 
}