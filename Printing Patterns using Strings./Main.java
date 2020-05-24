import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
		    String str=s.nextLine();
		   StringBuilder sb=new StringBuilder();
		   int mid=str.length()/2;
		   int spaces=str.length()-1;
		   for(int i=mid;i<str.length();i++)
			   {
			  for(int j=1;j<=spaces;j++)
				  System.out.print(" ");
			    sb.append(str.charAt(i));
		        System.out.println(sb);
		        spaces--;
		       }
		   for(int i=0;i<mid;i++)
		   {
			   for(int j=1;j<=spaces;j++)
					  System.out.print(" ");
			   sb.append(str.charAt(i));
	        System.out.println(sb);
	        spaces--;
	       }
  }
}