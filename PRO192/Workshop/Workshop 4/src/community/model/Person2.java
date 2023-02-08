package community.model;

public class Person2 {
	protected String name;
	protected String address;
	//constructor
	public Person2(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person[name = %s , address = %s ", name, address) ;
	}
	

}
