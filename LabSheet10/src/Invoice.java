
public class Invoice {

		private int Id;
        private Customer customer;
        private double Amount;
        
      public Invoice (int Id,Customer customer,double Amount) {
    	  this.Id = Id;
    	  this.customer = customer;
    	  this.Amount = Amount;
      }
      public int getId() {
    	  return Id;
      }
      public Customer getCustomer() {
    	  return this.customer;
      }
      public void setCustomer(Customer customer) {
    	  this.customer = customer;
      }
      public double getAmount() {
    	  return this.Amount;
      }
      public void setAmount(double Amount) {
    	  this.Amount = Amount;
      }
      public int getCustomerID() {
    	  return getCustomer().getID();
      }
      public String getCustomerName() {
    	  return getCustomer().getName();
      }
      public int getCustomerDiscount() {
    	  return getCustomer().getDiscount();
      }
      public double getAmountAfterDiscount() {
    	  return getAmount()-(getAmount()*getCustomerDiscount()/100);
      }
      public String toString() {
    	  return "Invoice id = "+Id+"customer = "+customer.toString()+".Amount = "+Amount;
      }
	}


