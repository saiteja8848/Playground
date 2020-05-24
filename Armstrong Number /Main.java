import java.util.*;
public class Main
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int t=n,count=0,sum=0,d,i,p;
  while(t!=0)
  {
      count++;
      t/=10;
  }
  t=n;
      while(t!=0)
      {
          d=t%10;
          i=1;
          p=1;
          while(i<=count)
          {
              p=p*d;
              i++;
          }
          sum=sum+p;
          t/=10;
      }
      if(sum==n)
      System.out.println("Armstrong Number");
      else
      System.out.println("Not a Armstrong Number");  
}
}
