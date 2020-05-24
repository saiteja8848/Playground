import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String a[]=str.split(" ");
    for(int i=0;i<a.length;i++)
		    {
		    	int count=1;
		    	for(int j=i+1;j<a.length;j++)
		    	{
		    		if(a[j].equals(a[i]))
		    			count++;
		    	}
		    	if(count==1)
		    		System.out.print(a[i]+" ");
		    }
  }
}