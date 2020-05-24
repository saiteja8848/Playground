import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
     for(int j=0;j<c;j++) 
      a[i][j]=s.nextInt();
    int col=c-1;
     for(int i=0;i<r;i++){
     for(int j=0;j<c;j++) 
     {System.out.print(a[j][col]+" ");
     }
       col--;
       System.out.println();
     }
  }
}