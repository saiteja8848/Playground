import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
         char ch=s.next().charAt(0);
          int key=s.nextInt();
        if(ch>='a'&&ch<='z')
        {    
          int v = ch - key;
          if(v<97)
          {
            int x= (97-v)-1;
            int y=122-x;
            char c=(char)y;
            System.out.print(c);
          }
            
            
        }
      else
      {
        int v= ch - key;
        char c =(char)v;
        System.out.print(c);
      }
   
      
    }
}