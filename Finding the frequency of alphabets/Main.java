import java.util.*;
import java.lang.*;
 class Main
{
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++)
        {
           char  ch = sb.charAt(i);
            int count=0;
            for(int j=0;j<sb.length();j++)
            {
                if(ch==sb.charAt(j)&&ch!='$')
                {
                    count++;
                    sb.setCharAt(j,'$');
                }
                
            }
            if(ch!='$')
            {System.out.print(ch);
            System.out.print(count+" ");}
            
            
            
        }
        


	}
}