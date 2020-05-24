import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
    int max=0,index=0;
    for(int i=0;i<n;i++)
    {
        int count=0;
      for(int j=0;j<n;j++)
      {
        if(a[i]==a[j])
          count++;
      }
      if(count>max)
      {max=count;index=i;}
    }
    System.out.println(a[index]);
    
    
  }
}