import java.util.Scanner;
class Main{
 static void fun(int n)
 {
   int count=1,i=2,f=1;
     while(count<=n)
     {
       f=1;
       for(int j=2;j<=i/2;j++)
       {
         if(i%j==0)
         {f=0;break;}
       }
       if(f==1)
       {
         System.out.println(i);
         count++;
       }
       if(i>=n)
         break;
       i++;
     }

 }
  
  
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      fun(n);
	}
}