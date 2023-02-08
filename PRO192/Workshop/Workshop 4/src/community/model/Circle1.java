package community.model;

public class Circle1 {
	double radius = 1.0;
	String color = "red";
	
	
	//constructor
	public Circle1(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public Circle1(double radius) {
		super();
		this.radius = radius;
	}
	public Circle1() {
		super();
	}
	
	
	//getter setter
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Circle[radius = %.2f , color = %s ", radius,color);
	}
	
	

}
