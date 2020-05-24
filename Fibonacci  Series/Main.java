import java.util.*;
import java.io.*;
class Main
{
     public static void main(String[] args) throws Exception
     {
       InputStreamReader isr =new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);
       int n=Integer.parseInt(br.readLine());
       int f1=0,f2=1,f3;
       if(n>0)
       {
          System.out.println("Enter the limit for Fibonacci: "+n);
         System.out.print("The Fibonacci series is :");
          if(n==1)
             System.out.print(f1);
          else if(n==2)
          {System.out.print(f1+" ");
           System.out.print(f2+" ");
          }
         else
         {
           int count=2;
           System.out.print(f1+" ");
           System.out.print(f2+" ");
           while(count<n)
           {f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;
            count++;
           }
         }
       }
       else
       {
          System.out.println("Enter the limit for Fibonacci: "+n);
          System.out.println("Exception occurred");
       }
     }
}