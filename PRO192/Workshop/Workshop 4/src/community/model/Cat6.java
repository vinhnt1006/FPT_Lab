package community.model;

public class Cat6 extends Mammal6 {

	/**
	 * @param name
	 */
	public Cat6(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//method
	public void greets() {
		System.out.println("Meow");
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Cat[ %s ]", super.toString());
	}
	

}
