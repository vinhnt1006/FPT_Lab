package testclass;

public class Invoice {
	private int id;
	private Customer4 customer;
	private double amount;

	// constructor
	public Invoice(int id, Customer4 customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer4 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer4 customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCustomerID() {
		return this.customer.getId();
	}

	public int getCustomerDiscount() {
		return this.customer.getDiscount();

	}

	public double getAmountAfterDiscount() {
		return this.amount - (this.amount * this.customer.getDiscount() / 100);
	}

	public String getCustomerName() {
		return this.customer.getName();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Invoice[ id = %d , customer = %s , amount = %f]", id, customer.toString(), amount);

	}

}
