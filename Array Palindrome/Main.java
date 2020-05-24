import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int i=0,j=n-1;
      while(i<j)
      {
        if(a[i]==a[j])
        {i++;j--;}
        else
        {
          System.out.println("No");
          break;
        }
      }
      if(i>j)
        System.out.println("Yes");
      
      
    }
}