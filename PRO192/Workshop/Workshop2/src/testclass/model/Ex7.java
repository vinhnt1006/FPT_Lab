package testclass.model;

import testclass.MyLine;
import testclass.MyPoint6;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLine l1 = new MyLine(0, 0, 3, 4);
		System.out.println(l1);

		MyPoint6 p1 = new MyPoint6(0, 0);
		MyPoint6 p2 = new MyPoint6(3, 4);
		MyLine l2 = new MyLine(p1, p2);
		System.out.println(l2);

		System.out.println("Line 1 length: " + l1.getLength());
		System.out.println("Line 1 gradient: " + l1.getGradient());

		System.out.println("Line 2 length: " + l2.getLength());
		System.out.println("Line 2 gradient: " + l2.getGradient());

	}

}
