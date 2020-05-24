import java.util.Scanner;
class Main{
    public static void main(String args[]){
     Scanner s=new Scanner(System.in);
        String alp="abcdefghijklmnopqrstuvwxyz";
        String str=s.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder(str);
        int count[]=new int[26];
        for(int i=0;i<26;i++)
        count[i]=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)!=' '){
            int offset = sb.charAt(i)-'a';
            count[offset]++;}
            
        }
        
        for(int i=0;i<26;i++)
        {
            if(count[i]==0)
            {
                System.out.print(alp.charAt(i)+" ");
            }
        }
        
    }
}