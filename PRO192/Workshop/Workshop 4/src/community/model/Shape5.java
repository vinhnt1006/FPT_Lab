package community.model;

public class Shape5 {
	protected String color = "red";
	protected boolean filled = true;
	/**
	 * @param color
	 * @param filled
	 */
	public Shape5(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public Shape5() {
		super();
	}
	//getter setter 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Shape[ color = %s , filled = %b", color,filled);
	}
	
	

}
