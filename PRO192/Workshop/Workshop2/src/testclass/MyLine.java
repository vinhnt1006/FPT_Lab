package testclass;

public class MyLine {
	private MyPoint6 begin;
	private MyPoint6 end;
	
	public MyLine(int x1, int y1 , int x2 , int y2) {
		begin = new MyPoint6(x1, y1);
		end = new MyPoint6(x2, y2);
		
	}
	public MyLine(MyPoint6 begin , MyPoint6 end) {
		this.begin = begin;
		this.end = end;
	}
	public MyPoint6 getBegin() {
		return begin;
	}
	public void setBegin(MyPoint6 begin) {
		this.begin = begin;
	}
	public MyPoint6 getEnd() {
		return end;
	}
	public void setEnd(MyPoint6 end) {
		this.end = end;
	}
	//METHOD
	// Begin 
	public int getBeginX() {
		return begin.getX();
	}
	
	public void setBeginX(int x) {
		begin.setX(x);
	}
	public int getBeginY() {
		return begin.getY();
	}
	public void setBeginY(int y) {
		begin.setY(y);
	}
	// End
	public int getEndX() {
		return end.getX();
	}
	public void setGetEndX(int x) {
		end.setX(x);
	}
	public int getEndY() {
		return end.getY();
	}
	public void setEndY(int y) {
		 end.setY(y);
	}
	
	public int[] getBeginXY() {
		int[] a = {getBeginX(),getBeginY()};
		return a;
	}
	
	public void setBeginXY(int x, int y) {
		begin.setX(x);
		begin.setY(y);
	}
	public int[] getEndXY() {
		int[] arr = {getEndX(), getEndY()};
		return arr;
	}
	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}
	public double getLength() {
		return begin.distance(end);
	}
	public double getGradient() {
		int xDiff = this.begin.getX() - this.end.getX();
		int yDiff = this.begin.getY() - this.end.getY();
		return Math.atan2(yDiff, xDiff);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("MyLine[begin = (%d,%d), end = (%d,%d)]",begin.getX(),begin.getY(),end.getX(),end.getY());
	}
	
	
	
	
	
	

}
