package testclass.model;

import testclass.MyPoint6;
import testclass.Triangle9;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Triangle9 myTriangle = new Triangle9(new MyPoint6(5, 5), new MyPoint6(15, 15), new MyPoint6(5,25));
	        System.out.println(myTriangle.getPerimeter());
	        System.out.println(myTriangle.getType());
	        System.out.println(myTriangle.getV1());
	        System.out.println(myTriangle.getV2());
	        System.out.println(myTriangle.getV3());
	        System.out.println(myTriangle.toString());

	}

}
