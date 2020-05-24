import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int count=0,top=-1,max=-1;
      int stack[]=new int[n];
      for(int i=0;i<n;i++)
      {
       if(a[i]==1)
         stack[++top]=1;
        else
        {
          if(a[i]==0)
          {
            count=0;
          while(top!=-1)
          {
            count++;
            top--;
          }
            if(count>max)
              max=count; 
          }
        }
        
          
          
      }
       System.out.println(max); 
      
    }
}