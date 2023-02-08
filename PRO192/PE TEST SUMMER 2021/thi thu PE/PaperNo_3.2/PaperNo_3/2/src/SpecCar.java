/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class SpecCar extends Car {
	 private int type;

	public SpecCar() {
		super();
	}

	public SpecCar(int type) {
		super();
		this.type = type;
	}

	public SpecCar(String maker, int price,int type) {
		super(maker, price);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public void setData() {
		super.setMaker("XZ"+super.getMaker());
		super.setPrice(super.getPrice()+20);
	}
	 public int getValue() {
		 int newPrice = 0;
		 if(type<7) {
			 newPrice = 10+super.getPrice();
		 }
		 else {
			newPrice = 15+super.getPrice();
		}
		 return newPrice;
	 }
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMaker()+", " +super.getPrice()+", "+type;
	}
	 

}
