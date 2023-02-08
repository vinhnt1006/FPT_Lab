package community.model;

public class Point2d3 {
	protected float x = 0.0f;
	protected float y = 0.0f;
	//constructor
	public Point2d3(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point2d3() {
		super();
	}
	//getter setter
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setXY(float x , float y) {
		this.x = x;
		this.y = y;
	}
	public float[] getXY() {
		float[] arr = {this.x , this.y};
		return arr;
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%.2f , %.2f)", x,y);
	}
	

}
