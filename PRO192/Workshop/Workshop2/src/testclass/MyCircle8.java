package testclass;

public class MyCircle8 {
	private MyPoint6 center = new MyPoint6(0,0);
	private int radius = 1;
	
	//constructor
	public MyCircle8() {
		super();
	}


	public MyCircle8(MyPoint6 center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	
	// getter setter 

	public MyPoint6 getCenter() {
		return center;
	}


	public void setCenter(MyPoint6 center) {
		this.center = center;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	public void setCenterX(int x) {
		center.setX(x);
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterY(int y) {
		center.setY(y);
	}
	public int[] getCenterXY( ) {
		int[] arr = center.getXY();
		return arr;
	}
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	
	//method
	public double getArea() {
		return Math.PI * radius *radius;
	}
	public double getCircumference() {
		return Math.PI*2*radius;
	}
	public double distance(MyCircle8 another) {
		return	center.distance(another.center);
	}
	
	
	//to String
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("MyCircle[radius = %d, center = %s", radius,center.toString());
	}
	
	
	
	

}
