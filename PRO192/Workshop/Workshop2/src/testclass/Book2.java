package testclass;

public class Book2 {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public Book2(String name, Author[] authors, double price) {

		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book2(String name, Author[] authors, double price, int qty) {

		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void getAuthorNames() {
		int temp = 0;
		for(Author a : this.authors) {
			System.out.println("(" + (++temp) + ") " + a );
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "'" + name + "'" + " by " + authors.length + " authors " + 
				", price = " + price +
				", qty = " + qty;
	}

}
