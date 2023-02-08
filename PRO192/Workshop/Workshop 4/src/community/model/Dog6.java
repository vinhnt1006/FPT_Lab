package community.model;

public class Dog6 extends Mammal6 {

	/**
	 * @param name
	 */
	public Dog6(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//method
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog6 another) {
		System.out.println("Woooof");
	}
	//toStirng
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Dog[ %s ]", super.toString());
	}
	
}
