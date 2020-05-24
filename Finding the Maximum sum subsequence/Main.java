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
	      int stack[]=new int[n];
	      int top=-1,sum=0,max=-1;
	      for(int i=0;i<n;i++)
	      {
	    	  if(top==-1)
	    		  stack[++top]=a[i];
	    	  else if(stack[top]<a[i]&&top!=-1)
	    		 stack[++top]=a[i];   		
	    	  else
	    	  {
	    		  if(a[i]<stack[top])
	    		  {
	    			  sum=0;
	    			  while(top!=-1)
	    			  {
	    				  sum=sum+stack[top];
	    				  top--;
	    			  }
	    			
	    			  if(sum>max)
	    			     max=sum;
	    				  stack[++top]=a[i];		  
	    		  }
	    	  }
	      }
	      sum=0;
	      while(top!=-1)
	    	  {sum=sum+stack[top];top--;}
	      if(sum>max)
	    	  max=sum;
	      System.out.println(sum);
	      
    
    
  }
}