package testclass;

public class Account5 {
	private int id;
	private Customer5 customer;
	private double balance = 0.0;

	// constructor
	public Account5(int id, Customer5 customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account5(int id, Customer5 customer) {
		super();
		this.id = id;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer5 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer5 customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return this.customer.getName();
	}

	public Account5 deposit(double amount) {
		balance += amount;
		return this;
	}

	public Account5 withdraw(double amount) {
		if (this.balance >= amount)
			balance -= amount;
		else
			System.out.println("amount withdrawn exceeds the current balance");
		return this;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s balance = $%.2f", customer.toString(), balance);
	}

}
