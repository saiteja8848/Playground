import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String arr[]=str.split(" ");
    for(int i=0;i<arr.length;i++)
    {
      
      StringBuilder sb=new StringBuilder(arr[i]);
      System.out.print(sb.reverse()+" ");
    }
    
    
  }
}