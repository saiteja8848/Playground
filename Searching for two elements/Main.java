import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int n1=s.nextInt();
      int n2=s.nextInt();
      int p=-1,q=-1;
      for(int i=0;i<n;i++)
      {
        if(a[i]==n1)
          p=i;
        if(a[i]==n2)
          q=i;
      }
      System.out.println(p+"\n"+q);   
    }
}