import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String vowels="aeiou";
    for(int i=0;i<str.length();i++)
    {
      int flag=1;
        if(str.charAt(i)!=' ')
        {
           for(int j=0;j<vowels.length();j++)
           {
             if(str.charAt(i)==vowels.charAt(j))
             {flag=0;break;}
           }
        }
      if(flag==1)
        System.out.print(str.charAt(i));
      
    }
      
      
  }
}