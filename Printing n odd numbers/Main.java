import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
            int n=s.nextInt();
        int count=1,i=1;
         while(count<=n)
         {
           if(i%2!=0)
           {
             System.out.println(i);
             count++;
           }
           i++;
         }
	}
}