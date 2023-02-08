package community.model;

public class Staff2 extends Person2 {
	protected String school;
	protected double pay;
	//constructor
	public Staff2(String name, String address,String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	//getter setter 
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	// toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Staff[ %s , school = %s , pay = %.2f", super.toString(),school,pay);
	}
	
	
	

}
