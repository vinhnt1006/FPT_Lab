package testclass;

public class Triangle9 {
	private MyPoint6 v1;
	private MyPoint6 v2;
	private MyPoint6 v3;
	
	//constructor
	public Triangle9(MyPoint6 v1, MyPoint6 v2, MyPoint6 v3) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public Triangle9(int x1, int y1, int x2, int y2, int x3,int y3) {
		v1.setXY(x1, y1);
		v2.setXY(x2, y2);
		v3.setXY(x3, y3);
	}
	
	//getter setter
	
	
	//method
	public double getPerimeter() {
		double  a = v1.distance(v2);
		double b = v2.distance(v3);
		double c = v3.distance(v1);
		return a + b + c;
	}
	public MyPoint6 getV1() {
		return v1;
	}

	public void setV1(MyPoint6 v1) {
		this.v1 = v1;
	}

	public MyPoint6 getV2() {
		return v2;
	}

	public void setV2(MyPoint6 v2) {
		this.v2 = v2;
	}

	public MyPoint6 getV3() {
		return v3;
	}

	public void setV3(MyPoint6 v3) {
		this.v3 = v3;
	}

	public String getType(){
        if(this.v1.distance(this.v2) == this.v2.distance(this.v3) && this.v1.distance(this.v2) ==  this.v3.distance(this.v1)){
            return "Equilateral";
        }else if(this.v1.distance(this.v2) == this.v2.distance(this.v3) || 
                this.v1.distance(this.v2) ==  this.v3.distance(this.v1) ||
                this.v3.distance(this.v1) == this.v2.distance(this.v3)
                ){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }
	 public String toString() {
	        return "MyTriangle[" + "v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + ']';
	    }

}
