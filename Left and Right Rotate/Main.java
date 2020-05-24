import java.util.Scanner;
public class Main 
{
  public static void main (String[] args) 
  {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int a[]=new int[n+1];
     for(int i=1;i<=n;i++)
     a[i]=s.nextInt();
     int rotations=s.nextInt();
    int x=n/2;//even nos
    int even[]=new int[x+1];
    int y=n-x;//odd nos
    int odd[]=new int[y+1];
    int p=1,q=1;
    for(int i=1;i<=n;i++)
    {
        if(i%2==0)
            even[p++]=a[i];
        else
            odd[q++]=a[i];
        
    }
    int temp1,m=1,l=1;
   
    
for(int i=1;i<=rotations;i++)
{
    temp1=even[1];
    for(int d=1;d<p-1;d++)
     { even[d]=even[d+1];}
    even[p-1]=temp1;
    temp1=odd[q-1];
    for(int d=q-1;d>1;d--)
     { odd[d]=odd[d-1];}
    odd[1]=temp1;
}
 
m=1;l=1;
for(int i=1;i<=n;i++)
{
    
    if(i%2==0)
    System.out.print(even[m++]+ " ");
    else
    System.out.print(odd[l++]+" ");
    
}

      
  }
}