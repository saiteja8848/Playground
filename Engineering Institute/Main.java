//import required packages
import java.util.*;
class Faculty
{
   int Base;
        public Faculty(int Base)
        {this.Base=Base;}
  public void salary()
  {
     System.out.println("Base Salary:"+" "+Base);
  }
}
class CSE extends Faculty
{
 public CSE(int Base)
        {super(Base);}
  public void salary()
  {
     System.out.println("CSE Faculty:"+" "+(super.Base+3000));
  }
}
class IT extends Faculty
{
public IT(int Base)
        {super(Base);}
  public void salary()
  {
     System.out.println("IT Faculty:"+" "+(super.Base+5000)); 
  }
}
class ECE extends Faculty
{
public ECE(int Base)
        {super(Base);}
  public void salary()
  {
     System.out.println("ECE Faculty:"+" "+(super.Base+4500));  
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int base=s.nextInt();
    Faculty f=new Faculty(base);
    f.salary();
    CSE cs =new CSE(base);
    cs.salary();
    IT it =new IT(base);
    it.salary();
    ECE ece = new ECE(base);
    ece.salary();
  }
}  