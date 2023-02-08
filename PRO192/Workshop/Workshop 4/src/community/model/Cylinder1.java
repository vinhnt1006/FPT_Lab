package community.model;

public class Cylinder1 extends Circle1 {
	private double height = 1.0;

	//constructor
	public Cylinder1() {
		super();
		this.height = height;
	}

	public Cylinder1(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder1(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public Cylinder1(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	// getter setter
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	//constructor
	public double getVolume() {
		return getArea() * height;
	}

}
