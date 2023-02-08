package testclass;

public	class Book3 {
	private String isbn;
	private String name;
	private Author3 author;
	private double price;
	private int qty = 0 ;
	public Book3(String isbn, String name, Author3 author, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book3(String isbn, String name, Author3 author, double price, int qty) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getISBN() {
		return isbn;
	}
	public String getName() {
		return name;
	}
	public Author3 getAuthor() {
		return author;
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
	public String getAuthorName() {
		return this.author.getName();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Book[isbn = %s, name = %s ,"
				+ "%s" + ", price  = %f , qty = %d ", isbn,name,author.toString(),price, qty);
		
				
	}

}

