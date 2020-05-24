import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
       int a[]=new int[n+1];
    for(int i=1;i<=n;i++)
      a[i]=s.nextInt();
     int k=n/3,j=0;
    int b[]=new int[k];
    int start=1,end=3,sum=0;
    while(k!=0)
    {
      sum=0;
      for(int m=start;m<=end;m++)
      {sum=sum+a[m];}
      b[j]=sum;
      j++;
      start=start+3;
      end=end+3;
      k--;
    }
    int flag=-1;
    for(int p=0;p<j;j++)
    {
      
      if(p<j&&b[p]==b[p+1])
        flag=1;
    }
    if(flag==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
    
  }
}