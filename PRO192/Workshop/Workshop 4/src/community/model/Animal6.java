package community.model;

public class Animal6 {
	protected String name;

	/**
	 * @param name
	 */
	public Animal6(String name) {
		super();
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Animal[name = %s ]", name);
	}

}
