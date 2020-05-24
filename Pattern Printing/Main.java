import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int r=s.nextInt();
      int c=s.nextInt();
      int a[][]=new int[r+1][c+1];
      for(int i=1;i<=r;i++)
      {
        if(i==1)
        { for(int j=1;j<=c;j++)
            a[i][j]=j;
        }
        else
        {
          int k=1,m;
          while(k<=i)
          {  a[i][k]=i; k++;}
          m=i+1;
          while(m<=c)
          {a[i][m]=m;m++;}
        }
      }
      
      for(int i=r;i>=1;i--)
      {
        for(int j=c;j>=1;j--)
        {System.out.print(a[i][j]);}
        System.out.println();
      }
      
      
      
    }
}