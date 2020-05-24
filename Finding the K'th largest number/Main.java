import java.util.*;
class Main{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int k=s.nextInt();
      Arrays.sort(a);
      
      int c=1;
      for(int i=n-1;i>=0;i--)
      {
        if(c==k)
        {System.out.println(a[i]);
         break;}
        else
          c++;
      }
      
    }   
}