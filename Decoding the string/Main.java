import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	    int key=s.nextInt();
	    for(int i=0;i<str.length();i++)
	    {
	    	 if(str.charAt(i)==' ')
	    		 System.out.print(' ');
	    	 else
	    	 {
	    		 
	    		 if(str.charAt(i)>='a'&&str.charAt(i)<='z')
	    		 {
	    			 int d = str.charAt(i)-key;
	    			   if(d<97)
	    			   {int x = str.charAt(i)- 'a';
	    			       d=123-(key-x);}
	    			 char ch =(char)d;
	    			  System.out.print(ch);
	    		 }
	    		 
	    		 if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
	    		 {
	    			 int d = str.charAt(i)-key;
	    			  /* if(d<97)
	    			   {d=123-key}*/
	    			char ch =(char)d;
	    			 System.out.print(ch);
	    		 }
	    	 }
	    }
	    
	    
	    
	    
	    
  
  }
}