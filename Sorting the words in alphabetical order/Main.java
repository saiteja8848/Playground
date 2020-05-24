import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    s.nextLine();
    String str[]=new String[n];
    for(int i=0;i<n;i++)
      str[i]=s.nextLine().toLowerCase();
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(str[j].compareTo(str[i])<0)
        {
          String temp=str[i];
          str[i]=str[j];
          str[j]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
      System.out.println(str[i]);
      
      
  }
}