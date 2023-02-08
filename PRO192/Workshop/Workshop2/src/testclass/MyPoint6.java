package testclass;

public class MyPoint6 {
	private int x = 0;
	private int y = 0;

	public MyPoint6() {
		super();
	}

	public MyPoint6(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// method
	public int[] getXY() {
		int[] a = { this.x, this.y };
		return a;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public double distance(MyPoint6 another) {
		return Math.sqrt(Math.pow(another.getX() - x, 2) + Math.pow(another.getY() - y, 2));
	}

	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}

	public double distance() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d , %d)", this.x, this.y);
	}

}
