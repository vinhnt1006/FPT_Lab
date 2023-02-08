package community.model;

public class Student2 extends Person2 {
	protected String program;
	protected int year;
	protected double fee;
	//constructor
	public Student2(String name, String address,String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	//getter setter
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Student[ %s , program = %s , year = %d , fee = %.2f", super.toString(), program,year,fee);
	}
	
	

}
