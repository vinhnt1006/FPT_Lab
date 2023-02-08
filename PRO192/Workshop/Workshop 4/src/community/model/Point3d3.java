package community.model;

public class Point3d3 extends Point2d3 {
	protected float z = 0.0f;
	
	//constructor
	public Point3d3(float x, float y,float z) {
		super(x, y);
		this.z = z;
	}

	public Point3d3() {
		super();
		this.z = z;
	}
	//getter setter

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y , float z) {
		setXY(x, y);
		setZ(z);
	}
	public float[] getXYZ() {
		float[] arr = {x,y,z};
		return arr;
	}
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%.2f, %.2f , %.2f)", getX(),getY(),getZ());
	}
	
	
	
	

}
