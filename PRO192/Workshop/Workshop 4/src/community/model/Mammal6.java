package community.model;

public class Mammal6 extends Animal6 {

	/**
	 * @param name
	 */
	public Mammal6(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Mamal[ %s ]", super.toString());
	}

}
