import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price){
    this.price = price;
  }
  public int getPrice(){
    return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
public void setProduct(String product){
    this.product = product;
  }
  public String getProduct(){
    return product;
  }
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  public int getQuantity(){
    return quantity;
  }
}

class Bill extends Item
{
  public void calculatePrice(int p,int q){
    int result = (p*q);
    System.out.println("Total Price is : "+result);
}
}
class Main
{
  public static void main(String[] args)
  {    
    Scanner in = new Scanner(System.in);
    String m = in.next();
    int p = in.nextInt();
    int q = in.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    i.setPrice(p);
    c.setProduct(m);
    c.setQuantity(q);
    obj.calculatePrice(i.getPrice(),c.getQuantity());
    
    
  }
}