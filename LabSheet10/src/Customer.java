
public class Customer {
       private int Id;
       private String Name;
       private int Discount;

  public Customer (int Id,String Name,int Discount) {
	  this.Id = Id;
	  this.Name = Name;
	  this.Discount = Discount;
  }
  public int getID() {
	  return Id;

  }
  public String getName() {
	  return Name;
  }
  public int getDiscount() {
	  return Discount;
  }
  public void setDiscount(int Discount) {
	  this.Discount = Discount;
  }
  public String toString() {
	  return "name"+this.Id+(this.Discount);
  }
}