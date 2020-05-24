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
    int x=n/2;
   for(int i=0;i<x;i++)
   {
      for(int j=0;j<x;j++)
      {
        if(a[i]<a[j])
        {
         int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
   }
    for(int i=x;i<n;i++)
   {
      for(int j=x;j<n;j++)
      {
        if(a[i]>a[j])
        {
         int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");  
  }
}