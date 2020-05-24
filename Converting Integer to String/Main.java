import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int t=n;
    if(n<0)
    {  n = t-(2*(t));}
    String str="";
    while(n!=0)
    {
     int v=(n%10)+48;
			char ch =(char)(v);
			str=str+ch;
			n/=10;
    }
    StringBuilder sb=new StringBuilder(str);
     if(t>0)   
      System.out.println(sb.reverse());
    else
      System.out.println("-"+sb.reverse());
  }
}