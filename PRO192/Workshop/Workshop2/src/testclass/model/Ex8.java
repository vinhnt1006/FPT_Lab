package testclass.model;

import java.util.Arrays;

import testclass.MyCircle8;
import testclass.MyPoint6;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircle8 myCircle = new MyCircle8(new MyPoint6(5, 8), 6);
		System.out.println(myCircle.distance(new MyCircle8(new MyPoint6(30, 46), 2)));
		System.out.println(myCircle.getArea());
		System.out.println(myCircle.getCircumference());
		System.out.println(myCircle.toString());
		System.out.println(Arrays.toString(myCircle.getCenterXY()));

	}

}
