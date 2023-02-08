package community.model;

public class Circle5 extends Shape5 {
	protected double radius = 1.0;
	//constructor
	public Circle5(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle5(double radius) {
		super();
		this.radius = radius;
	}

	public Circle5() {
		super();
	}
	//getter setter
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//method
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Circle[ %s , radius = %.2f]", super.toString(),radius);
	}
	
	

}
