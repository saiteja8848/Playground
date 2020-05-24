import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int max=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		int sum,flag;
	   for(int i=0;i<n;i++)
	   {
		   sum=a[i];
		   sum++;
		   while(sum<=max)
		   {
             flag=1;
			   for(int j=i+1;j<n;j++)
			   {
				   if(sum==a[j])
                   {   System.out.print(a[i]+","+a[j]);flag=0;}
			   }
             if(flag==0)
			   System.out.println();
			   sum++;
		   }
	   };
  }
}