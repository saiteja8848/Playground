import java.util.*;
public class Main
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int sum=0,t,d,p,i;
    t=n;
    while(t!=0)
    {
        d=t%10;
        p=1;
        i=1;
        while(i<=d)
        {p*=i;i++;}
        sum=sum+p;
        t/=10;
    }
      if(sum==n)
      System.out.println("Yes");
      else
      System.out.println("No");
}
}
