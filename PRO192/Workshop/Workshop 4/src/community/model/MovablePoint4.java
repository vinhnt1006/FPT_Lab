package community.model;

public class MovablePoint4 extends Point4{
	protected float xSpeed = 0.0f;
	protected float ySpeed = 0.0f;
	public MovablePoint4(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	/**
	 * @param xSpeed
	 * @param ySpeed
	 */
	public MovablePoint4(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	/**
	 * 
	 */
	public MovablePoint4() {
		super();
	}
	//getter setter
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	
	
	

}
