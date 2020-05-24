import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n+1];
      int count[]=new int[n+1];
      for(int i=1;i<=n;i++)
      {
        a[i]=s.nextInt();
        count[a[i]]=1;
      }
      for(int i=1;i<=n;i++)
      {
        if(count[i]!=1)
          System.out.print(i);
      }
      
      
      
    }
}