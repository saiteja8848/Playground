//import required packages here
import java.util.*;
class Item
{
  private int price;
  //create various method to return attribute value(s)
   public void setPrice(int price){
    this.price =price;
  }
  public int getPrice(){
    return price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setQuantity(int quantity)
  {this.quantity=quantity;}
   public int getQuantity()
  {return this.quantity;}
  
  public String getProduct()
  {return this.product;}
  public void setProduct(String product)
  { this.product=product;}
}

class Bill 
{
   public void calculate(Customer c,Item i)
   {
     int value = i.getPrice() * c.getQuantity();
     System.out.println("Total Price is : "+value);
   }
  
}
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    String p=s.nextLine();
    int v=s.nextInt();
    int a=s.nextInt();
    Item i = new Item();
    i.setPrice(a);
    
    Customer c = new Customer();
    c.setProduct(p);
    c.setQuantity(v);
    
    Bill obj = new Bill();
    obj.calculate(c,i);
  }
}