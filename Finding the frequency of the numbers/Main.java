import java.util.*;
class Main{
    public static void main(String args[])
    {
     	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      Arrays.sort(a);
      //int count[]=new int[k+1];
      for(int i=1;i<=k;i++)
      {
        int count = 0;
        for(int j=0;j<n;j++)
        {
          if(a[j]==i)
            count++;
        }
        System.out.println(i+" "+count);
      }
        
        
        
        
    }
}