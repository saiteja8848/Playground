import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       	Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]!=0)
          System.out.print(a[i]+" ");
        else
          c++;
      }
      for(int i=1;i<=c;i++)
         System.out.print("0"+" ");      
    }
}