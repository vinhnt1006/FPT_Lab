package testclass;

public class Complex1 {
	private double real = 0.0;
	private double imag = 0.0;
	
	public Complex1() {
		super();
	}

	public Complex1(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		setReal(real);
		setImag(imag);
	}
	public boolean isReal() {
		return (imag ==0);
	}
	public boolean isImaginary() {
		return (real == 0);
	}
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	public boolean equals(Complex1 another) {
		return (this.imag == another.getImag() && this.real == another.getReal());
	}
	public double magnitude() {
		return Math.sqrt(imag*imag + real*real);
	}
	public Complex1 addInto(Complex1 right) {
		 real += right.real;
		 imag += right.imag;
		 return this;
	}
	public Complex1 addNew(Complex1 right) {
		return new Complex1(this.real + right.real , this.imag + right.imag);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%.2f + %.2fi", real,imag);
	}
	

}
	
