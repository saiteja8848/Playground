import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
       for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int l=-1;
      for(int i=0;i<n;i++)
      {
        if(a[i]>l)
          l=a[i];
      }
      System.out.println(l);      
    }
}